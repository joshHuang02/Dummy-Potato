#include <stdlib.h>         // Standard C library: free(), NULL...  
#include <stdbool.h>        // Standard true, false, and bool type  
#include <stdio.h>       	// akin to <conio>      
#include "lib/contracts.h"  // Our contracts library  
#include "lib/xalloc.h"     // Our allocation library  

void f(int *A, int *B, int n) {
	for (int i = 0; i < n; i++) {
		B[i] = A[i];
	}
}

int main() {
	
	int *A = xmalloc(sizeof(int) * 4);
	for (int i = 0; i < 4; i++) {
		A[i] = i;
	}

	f(A, &A[2], 2);
	// for (int k = 0; k < 3; k++) {
	// 	printf("%d \n", *(int*)A[k]);
	// }

	// for (int n = 0; n < 2; n++) {
	// 	printf("%d \n", *(int*)B[n]);
	// }

	for (int n = 0; n < 4; n++) {
		printf("%d \n", A[n]);
	}

	// for (int j = 0; j < 4; j++) {
	// 	free(A[j]);
	// }
	free(A);
	// free(A+1);
	// printf("%d \n", *(int*)A[2]);
	// A[2] = 100;
	// for (int j = 4; j >= 0; j--) {
	// 	free(&A[j]);
	// }

	// int *A = xmalloc(sizeof(int));
	// int *B = xcalloc(2, sizeof(int));
	// int *C = B + 1;
	// *A = 5;
	// *C = 6;
	// // printf("%d , %d , %d, %d \n", *A, *B, *(B + 1), *(B + 2));
	// printf("%d , %d , %d \n", *A, *B, *(B + 1));

	printf("yeet\n");
	return 0;
}