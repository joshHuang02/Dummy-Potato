#include <stdlib.h>         // Standard C library: free(), NULL...  
#include <stdbool.h>        // Standard true, false, and bool type  
#include "lib/contracts.h"  // Our contracts library  
#include "lib/xalloc.h"     // Our allocation library  
#include "queue.h"          // The queue interface  

/************************/
/*** Client interface ***/
/************************/

typedef struct list_node list;
struct list_node {
  void* data;
  list* next;
};

typedef struct queue_header queue;
struct queue_header {
  list* front;
  list* back;
  size_t size;
};

bool is_inclusive_segment(list* start, list* end, int i) {
  if (i == 1 && start == end && end->next == NULL) {
    return true;
  }
    
  if (i < 1 || start->next == NULL) {
    return false;
  }

  return is_inclusive_segment(start->next, end, i - 1);
}

bool is_queue(queue_t Q) {
  if (Q == NULL) return false;
  // case 0 element
  if (Q->front == NULL && Q->size == 0) {
    return true;
  // case 1 element
  } else if (Q->front == Q->back && Q->size == 1) {
    if (Q->back != NULL &&  Q->back->next == NULL)
      return true;
    return false;
  // case multiple element
  } else {
    //length and NULL check
    list* node = Q->front;
    for (size_t i = 0; i < Q->size; i++) {
      if (node == NULL || (i == Q->size - 1 && node != Q->back)) 
        return false;
      node = node->next;
    }

    return is_inclusive_segment(Q->front, Q->back, Q->size);
  }
}

void print_queue(queue_t Q, print_data_fn* print_data) {
  /* OPTIONAL (but recommended) */
  if (Q == NULL) {
    printf("NULL Queue\n");
    return;
  }
  if (Q->size == 0) {
    printf("empty Queue\n");
    return;
  }
  list* node = Q->front;
  for (size_t i = 0; i < Q->size; i ++) {
    if (node->data == NULL) {
      printf("null |");
    } else {
      (*print_data)(node->data);
    }
    node = node->next;
  }
  if (Q->back->next == NULL) {
    printf("null ending\n");
  }
  printf("\n");
  return;
}

/* Other functions go there */
// typedef ______* queue_t;  
  
queue_t queue_new() /* O(1) */  
//@ensures \result != NULL;
//@ensures is_queue(\result);
{
  queue_t Q = xmalloc(sizeof(queue));
  //@assert Q != NULL;
  ASSERT(Q != NULL);
  Q->front = NULL;
  Q->back = NULL;
  Q->size = 0;
  ENSURES(Q != NULL);
  ENSURES(is_queue(Q));
  return Q;
}
  
size_t queue_size(queue_t Q) /* O(1) */  
/*@requires Q != NULL; @*/ 
//@requires is_queue(Q);
/*@ensures \result >= 0; @*/
{
  REQUIRES(Q != NULL);
  REQUIRES(is_queue(Q));
  return Q->size;
}
  
/* adds an item to the back of the queue */  
void enq(queue_t Q, void* x) /* O(1) */  
/*@requires Q != NULL; @*/
//@requires is_queue(Q);
//@ensures is_queue(Q);
{
  REQUIRES(Q != NULL);
  REQUIRES(is_queue(Q));

  list* L = xmalloc(sizeof(list));
  L->data = x;
  L->next = NULL;
  if (queue_size(Q) == 0) {
    Q->front = L;
    Q->back = L;
    Q->front->next = NULL;
  } else {
    //@assert Q != NULL && Q->back != NULL && L != NULL;
    ASSERT(Q != NULL && Q->back != NULL && L != NULL);
    Q->back->next = L;
    Q->back = Q->back->next;
    Q->back->next = NULL;
  }
  // Q->back->next == NULL;
  Q->size += 1;

  ENSURES(is_queue(Q));
}
  
/* removes an item from the front of the queue */  
void* deq(queue_t Q) /* O(1) */  
/*@requires Q != NULL && queue_size(Q) > 0; @*/
//@requires is_queue(Q);
//@ensures is_queue(Q);
{
  REQUIRES(Q != NULL && queue_size(Q) > 0);
  REQUIRES(is_queue(Q));

  ASSERT(Q->front != NULL);
  //@assert Q->front != NULL;
  list* node = Q->front;
  Q->front = Q->front->next;
  Q->size -= 1;
  ASSERT(node != NULL);
  //@assert node != NULL;
  ENSURES(is_queue(Q));
  void* data = node->data;
  free((void*)node);
  return data;
}

/* doesn't remove the item from the queue */  
void* queue_peek(queue_t Q, size_t i) /* O(i) */  
{
  REQUIRES(Q != NULL && i < queue_size(Q));
  REQUIRES(is_queue(Q));

  list* node = Q->front;
  for (size_t j = 0; j <= i; j ++) {
    if (j == i) {
      ENSURES(is_queue(Q));
      return node->data;
    }
    node = node->next;
  }
  ENSURES(is_queue(Q));
  return NULL;
}
  
void queue_reverse(queue_t Q) /* O(n) */  
/*@requires Q != NULL; @*/
//@requires is_queue(Q);
//@ensures is_queue(Q);
{
  REQUIRES(Q != NULL);
  REQUIRES(is_queue(Q));
  if (queue_size(Q) <= 1) {
    return;
  }

  ASSERT(Q->front != NULL); // b/c size 1 and 0 dont do anything
  list* prev = NULL;
  list* current = Q->front;
  for (size_t i = 0; i < Q->size; i ++) {
    list* tempNext = current->next;
    current->next = prev;
    prev = current;
    current = tempNext;
  }
  Q->front = prev;
  ASSERT(Q->front != NULL);
  //setting the back node again
  list* node = Q->front;
  for (size_t i = 0; i < Q->size; i ++) {
    ASSERT(Q->back != NULL);
    Q->back = node;
    node = node->next;
  }
  ASSERT(Q->back->next == NULL);
  ENSURES(is_queue(Q));
  //@assert Q->back->next == NULL;
}

/* O(n) worst case, assuming P is O(1) */  
bool queue_all(queue_t Q, check_property_fn* P)  
/*@requires Q != NULL && P != NULL; @*/
//@requires is_queue(Q);
{
  REQUIRES(Q != NULL && P != NULL);
  REQUIRES(is_queue(Q));

  if (queue_size(Q) == 0) return true;

  ASSERT(Q->front != NULL);
  list* node = Q->front;
  while (node != NULL) {
    if ( !(*P)(node->data)) 
      return false;
    node = node->next;
  }
  return true;
}

void* iterater(void* base, list* node, iterate_fn* F) 
{
  REQUIRES(F != NULL);

  if (node == NULL) return base;
  base = (*F)(base, node->data);
  return iterater(base, node->next, F);
}

/* O(n) worst case, assuming F is O(1) */  
void* queue_iterate(queue_t Q, void* accum, iterate_fn* F)  
/*@requires Q != NULL && F != NULL; @*/
//@requires is_queue(Q);
{
  REQUIRES(Q != NULL && F != NULL);
  REQUIRES(is_queue(Q));

  if (queue_size(Q) == 0) return accum;
  ASSERT(Q->front != NULL);
  return iterater(accum, Q->front, F);
}


// void queue_freeold(queue_t Q, free_fn *F) 
// {
//   REQUIRES(Q != NULL);

//   int size = (int)Q->size;
//   for (int i = 0; i < size; i ++) {
//     void* data = deq(Q);
//     if (F == NULL) {
//       free(data);
//     } else {
//       (*F)(data);
//     }
//   }
//   // free the queue struct itself
//   free((void*)Q);
// }

void queue_free(queue_t Q, free_fn *F) 
{
  REQUIRES(Q != NULL);

  size_t size = Q->size;
  for (size_t i = 0; i < size; i ++) {
    list* node = Q->front;
    if (node != Q->back)
      Q->front = Q->front->next;
    
    void* data = node->data;
    free((void*)node);

    if (F == NULL) {
      free(data);
    } else {
      (*F)(data);
    }
  }
  // free the queue struct itself
  if (Q != NULL)
    free((void*)Q);
}