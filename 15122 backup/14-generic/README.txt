This code directory contains the following progression:

1. hash dictionaries as seen in last lecture
        # cd lastlecture
   a. Produce example
        # cc0 -dx produce.c0 hdict.c0 produce-test.c0
   b. Word count example
        # cc0 -dx lib/*.c0 words.c0 hdict.c0 words-test.c0
   c. DOESN'T WORK in combination
   	# cc0 -dx lib/*.c0 hdict.c0 produce.c0 words.c0 combined-test.c0


2. Hash dictionaries updated with void* for entry and key
        # cd voidstar
   a. Produce example
        # cc0 -dx hdict.c1 produce.c1 produce-test.c1
   b. Word count example
	# cc0 -dx lib/*.c0 hdict.c1 words.c1 words-test.c1
   c. DOESN'T WORK in combination
   	# cc0 -dx lib/*.c0 hdict.c1 produce.c1 words.c1 combined-test.c1


3. Generic hash dictionaries (with void* and function pointers)
        # cd generic
	# cc0 -dx lib/*.c0 hdict.c1 produce.c1 words.c1 combined-test.c1


3. Generic hash dictionaries with print function
        # cd generic-with-print
	# cc0 -dx lib/*.c0 hdict.c1 produce.c1 words.c1 combined-test.c1
