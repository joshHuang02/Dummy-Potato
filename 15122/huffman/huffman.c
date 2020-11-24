/**************************************************************************/
/*              COPYRIGHT Carnegie Mellon University 2020                 */
/* Do not post this file or any derivative on a public site or repository */
/**************************************************************************/


/* Huffman coding
 *
 * 15-122 Principles of Imperative Computation
 */

#include <stdlib.h>
#include <stdbool.h>
#include <stdio.h>
#include <string.h>
#include <assert.h>
#include <ctype.h>

#include "lib/contracts.h"
#include "lib/xalloc.h"
#include "lib/file_io.h"
#include "lib/heaps.h"

#include "freqtable.h"
#include "htree.h"
#include "encode.h"
#include "bitpacking.h"

// Print error message
void error(char *msg) {
  fprintf(stderr, "%s\n", msg);
  exit(1);
}

/* in htree.h: */
/* typedef struct htree_node htree; */
struct htree_node {
  symbol_t value;
  unsigned int frequency;
  htree *left;
  htree *right;
};

/**********************************************/
/* Task 1: Checking data structure invariants */
/**********************************************/

/* forward declaration -- DO NOT MODIFY */
bool is_htree(htree *H);

bool is_htree_leaf(htree *H) {
  if (H == NULL) return false;

  return H->frequency > 0 && H->left == NULL && H->right == NULL;
}

bool is_htree_interior(htree *H) {
  if (H == NULL) return false;

  return (is_htree(H->left) && is_htree(H->right)
          && (H->frequency == H->left->frequency + H->right->frequency));
}

bool is_htree(htree *H) {
  if (H == NULL) return false;

  return (is_htree_leaf(H) || is_htree_interior(H));
}


/********************************************************/
/* Task 2: Building Huffman trees from frequency tables */
/********************************************************/

/* for libs/heaps.c */
bool htree_higher_priority(elem e1, elem e2) {
  htree *H1 = (htree*)e1;
  htree *H2 = (htree*)e2;

  return H1->frequency < H2->frequency;
}

// build a htree from a frequency table
htree* build_htree(freqtable_t table) {
  REQUIRES(table != NULL);

  pq_t Q = pq_new(NUM_SYMBOLS, &htree_higher_priority, &free);

  int uniqueSymbols = 0;
  for (int i = 0; i < NUM_SYMBOLS; i++) {
    // test
    // printf("%d , %d \n", i, table[i]);
    if (table[i] > 0) {
      uniqueSymbols ++;
      htree *H = xmalloc(sizeof(htree));
      H->frequency = table[i];
      H->value = (symbol_t)i;
      H->left = NULL;
      H->right = NULL;

      ASSERT(is_htree(H));
      pq_add(Q, (void*)H);
    }
  }
  if (uniqueSymbols < 2) error("Frequency Table has less than 2 symbols!");

  bool finished = false;
  while (!finished) {
    ASSERT(!pq_empty(Q));
    htree *H1 = (htree*)pq_rem(Q);
    ASSERT(!pq_empty(Q));
    htree *H2 = (htree*)pq_rem(Q);

    if (pq_empty(Q)) finished = true;

    htree *parent = xmalloc(sizeof(htree));
    parent->frequency = H1->frequency + H2->frequency;
    parent->value = 0;
    parent->right = H1;
    parent->left = H2;

    ASSERT(is_htree(parent));
    pq_add(Q, (void*)parent);
  }
  // Q should have only one htree
  htree *wholeTree = pq_rem(Q);
  pq_free(Q);

  ENSURES(is_htree(wholeTree));
  print_htree(wholeTree);
  return wholeTree;
}


/*******************************************/
/*  Task 3: decoding a text                */
/*******************************************/

void loopSrc(htree* H, bit_t *code, size_t *stringLen, symbol_t *S) {
  size_t length = 0;
  htree *traveller = H;
  for (size_t i = 0; code[i] != '\0'; i++) {
    switch(code[i]){
      case '0':
        traveller = traveller->left;
        if (is_htree_leaf(traveller)) {
          //test
          // printf("%c", traveller->value);
          if (S != NULL) S[length] = traveller->value;
          length ++;
          traveller = H;
        }
        break;
      case '1':
        traveller = traveller->right;
        if (is_htree_leaf(traveller)) {
          //test
          // printf("%c", traveller->value);
          if (S != NULL) S[length] = traveller->value;
          length ++;
          traveller = H;
        }
        break;
      default:
        error("Input code contained characters other than 0 and 1");
        break;
    }
    fflush(stdout);
  }
  *stringLen = length;
}
// Decode code according to H, putting decoded length in src_len
symbol_t* decode_src(htree *H, bit_t *code, size_t *src_len) {
  REQUIRES(is_htree(H));
  REQUIRES(code != NULL);

  // first pass without string to find src_length
  loopSrc(H, code, src_len, NULL);
  // make string pointer and do second pass to fill string
  symbol_t *S = xcalloc(sizeof(char), *src_len);
  loopSrc(H, code, src_len, S);

  //test
  printf("src_len: %zu \n", *src_len);
  printf("Result: %s\n", S);

  return S;
}


/****************************************************/
/* Tasks 4: Building code tables from Huffman trees */
/****************************************************/
void populate_table(codetable_t table, htree* traveller, bit_t *path, int i) {
  if (is_htree_leaf(traveller)) {
    table[traveller->value] = path;
    return;
  } else {
    ASSERT(is_htree_interior(traveller));
    path[i] = 0;
    populate_table(table, traveller->left, path, i + 1);
  }
}

// Returns code table for characters in H
codetable_t htree_to_codetable(htree *H) {
  REQUIRES(is_htree(H));

  htree* traveller = H;
  bit_t *path[NUM_SYMBOLS];
  int i = 0;
  codetable_t table[NUM_SYMBOLS];
  
  populate_table(table, traveller, path, i);

  return *table;
}


/*******************************************/
/*  Task 5: Encoding a text                */
/*******************************************/

// Encodes source according to codetable
bit_t* encode_src(codetable_t table, symbol_t *src, size_t src_len) {
  // WRITE ME
  (void)table; (void)src; (void)src_len; // bogus
  return NULL; // bogus
}


/**************************************************/
/*  Task 6: Building a frequency table from file  */
/**************************************************/

// Build a frequency table from a source file (or STDIN)
freqtable_t build_freqtable(char *fname) {
  // WRITE ME
  (void)fname; // bogus
  return NULL; // bogus
}



/************************************************/
/*  Task 7: Packing and unpacking a bitstring   */
/************************************************/

// Pack a string of bits into an array of bytes; length = strlen(bits)/8
uint8_t* pack(bit_t *bits) {
  // WRITE ME
  (void)bits;  // bogus
  return NULL; // bogus
}

// Unpack an array of bytes c of length len into a NUL-terminated string of ASCII bits
bit_t* unpack(uint8_t *c, size_t len) {
  // WRITE ME
  (void)c; (void)len;  // bogus
  return NULL;         // bogus
}
