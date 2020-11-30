#include <stdlib.h>        // Standard C library: free(), NULL...
#include <stdbool.h>       // Standard true, false, and bool type
#include <stdio.h>         // akin to <conio>
#include "lib/contracts.h" // Our contracts library
#include "lib/xalloc.h"    // Our allocation library

bool parse(int *i)
{
    *i = 45;
    return true;
}

int main()
{
    int i = 0;

    if (parse(&i))
        printf("%d\n", i);
    else
        printf("oh no\n");

    int *a = malloc(sizeof(int));
    *a = 0;
    printf("%d\n", *a);
    free(a);
    return 0;
}