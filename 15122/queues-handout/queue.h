/**************************************************************************/
/*              COPYRIGHT Carnegie Mellon University 2020                 */
/* Do not post this file or any derivative on a public site or repository */
/**************************************************************************/


/*
 * Extended interface of queues
 *
 * 15-122 Principles of Imperative Computation
 */

#ifndef __QUEUE_EXTENDED_H__
#define __QUEUE_EXTENDED_H__

#include <stdbool.h>
#include <stdlib.h>

/*************************/
/*** Library interface ***/
/*************************/

// typedef ______* queue_t;
typedef struct queue_header* queue_t;

typedef void print_data_fn(void *x);            // may be useful for debugging

/* O(1) */
queue_t queue_new()
  /*@ensures \result != NULL; @*/ ;

/* O(1) */
size_t queue_size(queue_t Q)
  /*@requires Q != NULL; @*/
  /*@ensures \result >= 0; @*/ ;

/* O(1) -- adds an item to the back of the queue */
void enq(queue_t Q, void *x)
  /*@requires Q != NULL; @*/ ;

/* O(1) -- removes an item from the front of the queue */
void *deq(queue_t Q)
  /*@requires Q != NULL && queue_size(Q) > 0; @*/ ;

/* O(i) -- doesn't remove the item from the queue */
void *queue_peek(queue_t Q, size_t i)
  /*@requires Q != NULL && i < queue_size(Q); @*/ ;

/* O(n) */
void queue_reverse(queue_t Q)
  /*@requires Q != NULL; @*/ ;

typedef bool check_property_fn(void *x);
/* O(n) worst case, assuming P is O(1) */
bool queue_all(queue_t Q, check_property_fn* P)
  /*@requires Q != NULL && P != NULL; @*/ ;

typedef void *iterate_fn(void *accum, void *x);
/* O(n) worst case, assuming accum is O(1) */
void *queue_iterate(queue_t Q, void *accum, iterate_fn *F)
  /*@requires Q != NULL && F != NULL; @*/ ;

typedef void free_fn(void *x);
/* Frees all the data elements using F if F != NULL @*/
void queue_free(queue_t Q, free_fn *F)
  /*@requires Q != NULL; @*/ ;

#endif
