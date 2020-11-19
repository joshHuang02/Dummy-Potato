#include <stdlib.h>      // declares 'malloc' and 'free'
#include "lib/xalloc.h"  // declares 'xmalloc'
#include "lib/contracts.h" // declares IF_DEBUG
#include <assert.h>      // declares 'assert'
#include <stdio.h>       // akin to <conio>
#include <stdbool.h>  

int main() {
	int *p = malloc(sizeof(int));
	int *q = p;
	free(q);
	*p = 3;
}