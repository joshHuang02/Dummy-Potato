15-122 Principles of Imperative Computation
Huffman coding

==========================================================

Files you won't modify:
   lib/contracts.h     - Contracts for C
   lib/xalloc.{c,h}    - NULL-checking allocation
   lib/file_io.{c,h}   - basic file I/O
   lib/heap.{c,h}      - Priority queues, implemented as heaps

   data/source/*       - sample source files
   data/freq/*         - sample frequency files
   data/htree/*        - sample Huffman trees
   data/binascii/*     - sample Huffman codes
   data/compressed/*   - sample compressed files

   freqtable.{c,h}     - frequency table definitions and operations
   htree.{c,h}         - Huffman tree definitions and operations
   encode.{c,h}        - top-level text encoding/decoding
   bitpacking.{c,h}    - bit packing utilities
   compress.{c,h}      - top-level file compression/uncompression
   main.c              - Application top-level
   Makefile            - Utility for building executables

Files you may extend:
   huffman.c           - Tasks 1-7
   test-htree.c        - test file for is_htree functions (no need to submit)
   test-pack.c         - test file for pack and and unpack (no need to submit)

Files you will submit:
EITHER (if doing Tasks 8)
  huffman.c.hip
OR (if not doing Task 8)
  huffman.c

==========================================================

Compiling your is_htree functions and tests
   % make htree
   % ./htree-test

Compiling and running your other functions (with -DDEBUG)
   % make
   % ./huff-safe <parameters>
   % valgrind ./huff-safe <parameters>

Compiling and running your other functions (without -DDEBUG)
   % make fast
   % ./huff-fast <parameters>
   % valgrind ./huff-fast <parameters>

For a summary of the valid parameters, run
  % ./huff-safe
(huff-fast accepts the same parameters)
See writeup for which <parameters> to supply to test each function.

==========================================================

Submitting from the command line on andrew:
EITHER (task 8)
   % autolab122 handin huffman huffman.c.hip
OR (NO task 8)
   % autolab122 handin huffman huffman.c
then display autolab's feedback by running:
   % autolab122 feedback

Creating a tarball to submit with autolab.andrew.cmu.edu web interface:
EITHER (task 8)
   % tar -czvf handin.tgz huffman.c.hip
OR (NO task 8)
   % tar -czvf handin.tgz huffman.c
