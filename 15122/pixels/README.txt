15-122 Principles of Imperative Computation
Pixels

==========================================================

Files you will modify:
   pixel.c0      - skeleton pixel implementation
   tasks.c0      - tasks 4-7
   pixel-test.c0 - testing the pixel interface

Files you won't modify:
   pixel-array.c0 - alternate implementation of the pixel interface
   tasks-test.c0 - runs all the tests for tasks.c0

Files that don't exist yet:
   pixel-bad.c0 - a copy of your finished pixel.c0, with added bugs

==========================================================

Compiling:
   % cc0 -d -W -o pixel-test pixel.c0 pixel-test.c0
   % ./pixel-test

   % cc0 -d -W -o tasks-test pixel.c0 tasks.c0 tasks-test.c0
   % ./tasks-test

Compiling against the array implementation of pixels:
   % cc0 -d -W -o tasks-test-alt pixel-array.c0 tasks.c0 tasks-test.c0
   % ./tasks-test-alt

==========================================================

Submitting from the command line on andrew:
   % autolab122 handin pixels pixel.c0 pixel-bad.c0 pixel-test.c0 tasks.c0
then display autolab's feedback by running:
   % autolab122 feedback

Creating a tarball to submit with autolab.andrew.cmu.edu web interface:
   % tar -czvf handin.tgz pixel.c0 pixel-bad.c0 pixel-test.c0 tasks.c0
