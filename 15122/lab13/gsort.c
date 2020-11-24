#include <stdlib.h>
#include <stdbool.h>
#include <stdio.h>
#include <string.h>
#include "lib/gsort.h"
#include "lib/contracts.h"

void gsort(void *A, size_t count, size_t elt_size,swap_fn *swp,compare_fn *compar) {
	char *array = (char*)A;
	for (size_t i = 0; i < count * elt_size; i += elt_size) 
	{
		// this is index
		char *min = array + i;

		for (size_t j = i; j < count * elt_size; j += elt_size) 
		{
			if ((*compar)((void*)(array + j), (void*)(min)) < 1) {
				min = array + j;
			}
		}

		(*swp)((void*)(array + i), (void*)(min));
	}
}