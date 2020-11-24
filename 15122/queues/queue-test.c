#include <stdlib.h>         // Standard C library: free(), NULL...  
#include <stdbool.h>        // Standard true, false, and bool type  
#include "lib/contracts.h"  // Our contracts library  
#include "lib/xalloc.h"     // Our allocation library  
#include "queue.h" 

void print_data(void* x) {
  printf("%d | ", *(int*)x);
}

int main() {
  // int *a = xmalloc(sizeof(int));
  // int *b = xmalloc(sizeof(int));
  // int *c = xmalloc(sizeof(int));
  // int *d = xmalloc(sizeof(int));
  // int *e = xmalloc(sizeof(int));
  // int *f = xmalloc(sizeof(int));
  // int *g = xmalloc(sizeof(int));
  // int *h = xmalloc(sizeof(int));
  // int *i = xmalloc(sizeof(int));
  // int *j = xmalloc(sizeof(int));
  // int *k = xmalloc(sizeof(int));
  // int *l = xmalloc(sizeof(int));
  // int *m = xmalloc(sizeof(int));
  // *a = 1;
  // *b = 2;
  // *c = 3;
  // *d = 4;
  // *e = 5;
  // *f = 98;
  // *g = 53;
  // *h = 52;
  // *i = 51;
  // *j = 57;
  // *k = 54;
  // *l = 55;
  // *m = 56;

  queue_t Q = queue_new();
  
  // Using them, test the functions you wrote in file queue.c1
  // enq(Q, (void*)a);
  // enq(Q, (void*)b);
  // enq(Q, (void*)c);
  // enq(Q, (void*)d);
  // enq(Q, (void*)e);
  // enq(Q, (void*)f);
  // enq(Q, (void*)g);
  // enq(Q, NULL);
  // enq(Q, (void*)h);
  // enq(Q, (void*)i);
  // enq(Q, (void*)j);
  // enq(Q, (void*)k);
  // enq(Q, (void*)l);
  // enq(Q, (void*)m);
  // print_queue(Q, &print_data);

  // queue_reverse(Q);
  // print_queue(Q, &print_data);

  // void* temp = deq(Q);
  // free(temp);
  // print_queue(Q, &print_data);
  
  // enq(Q, NULL);
  // print_queue(Q, &print_data);

  // free(deq(Q));
  // free(deq(Q));
  // print_queue(Q, &print_data);


  // print_queue(insertion_sort(Q), &print_data);

  queue_free(Q, NULL);

  queue_t R = queue_new();
  queue_free(R, NULL);


  // print_queue(Q, &print_data);

  printf("All tests passed!\n");

  return 0;
}