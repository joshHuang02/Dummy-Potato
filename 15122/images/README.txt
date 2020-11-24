15-122 Principles of Imperative Computation
Images

==========================================================

Files you will modify:
   imageutil.c0          - Skeleton image helper functions
   images-test.c0        - test your manipulations (optional)

Files you won't modify:
   remove-blue.c0        - You can modify this to respect the pixel/imageutil
                           interfaces if you'd like
   remove-blue-main.c0   - Runs remove_blue()
   remove-blue-test.c0   - Some unit tests for remove_blue()
   reflect-main.c0       - Runs reflect()
   blur-main.c0          - Runs blur()

Files that don't exist yet:
   pixel.c0              - Copy this over from Programming 2 (Pixels)
   reflect.c0            - Task 3
   blur.c0               - Task 4

Data:
   masks/blur-slightly.txt         - 3x3 blur mask
   masks/blur-mid.txt              - 5x5 blur mask
   masks/blur-more.txt             - 5x5 blur mask
   img/g5.png
   img/carnegie.png
   img/scs.png
   img/cmu.png
   img/tinytestpattern.png        - 3x2 image, may be good for testing
   img/g5-remove-blue.png         - result of remove_blue()
   img/g5-remove-blue-bug.png     - result of a buggy remove_blue()
   img/reflect-carnegie.png       - result of reflect()
   img/blur-scs-slightly.png      - result of blur with blur-slightly.txt
   img/blur-scs.png               - result of maskblur with mask blur-mid.txt

==========================================================

Using the imagediff utility: you have been given the result of running
remove_blue on both a correct and a buggy implementation of
g5.png. Running the following command shows that the two images differ
by 600 pixels.

   % imagediff -i img/g5-remove-blue.png -j img/g5-remove-blue-bug.png
   Loaded image img/g5-remove-blue.png. Dimensions are 800 by 600.
   Loaded image img/g5-remove-blue-bug.png. Dimensions are 800 by 600.
   Number of pixels with different colors: 600 out of 480000.
   0

If you want to visually see where these 600 different pixels actually
are, you can get imagediff to print out a new image that highlights
the places where differences occured:

   % imagediff -i img/g5-remove-blue.png -j img/g5-remove-blue-bug.png -o diff.png
   % display diff.png &

In addition to writing test cases, this can be a useful way of
debugging your code.

==========================================================

Compiling remove-blue and test cases:
   % cc0 -d -W -w -o remove-blue-test pixel.c0 imageutil.c0 remove-blue.c0 remove-blue-test.c0
   % ./remove-blue-test

   % cc0 -d -W -w -o remove-blue pixel.c0 imageutil.c0 remove-blue.c0 remove-blue-main.c0
   % ./remove-blue -i img/g5.png -o img/g5-my-output.png
       (This creates the output file img/g5-my-output.png. If you
        left off the "-o img/g5-my-output.png" part, the output
        file would be called img/g5_remove-blue.png.)

Compiling your unit tests. You can omit reflect.c0 or blur.c0 if you haven't written test cases for reflect() or blur(), respectively:
   % cc0 -d -W -w -o images-test pixel.c0 imageutil.c0 reflect.c0 blur.c0 images-test.c0
   % ./images-test

Compiling reflect:
   % cc0 -d -W -w -o reflect pixel.c0 imageutil.c0 reflect.c0 reflect-main.c0
   % ./reflect -i img/carnegie.png -o img/carnegie-my-output.png
       (This creates the output file img/carnegie-my-output.png. If
        you left off the "-o img/carnegie-my-output.png" part, the
        output file would be called img/carnegie_reflect.png.)
   % imagediff -i img/reflect-carnegie.png -j img/carnegie-my-output.png

Compiling blur:
   % cc0 -d -W -w -o blur pixel.c0 imageutil.c0 blur.c0 blur-main.c0
   % ./blur -i img/scs.png -o img/scs-my-blur.png -m masks/blur-mid.txt
       (This creates the output file img/scs-my-blur.png. If you
        left off the "-o img/scs-my-blur.png" part, the output
        file would be called img/scs_blur.png.)
   % imagediff -i img/blur-scs.png -j img/scs-my-blur.png

Compiling manipulate:
   % cc0 -d -W -w -o manipulate pixel.c0 imageutil.c0 reflect.c0 blur.c0 manipulate.c0 manipulate-main.c0
   % ./manipulate -i img/g5.png -o img/g5-my-manip.png

==========================================================

Submitting from the command line on andrew:
   % autolab122 handin images imageutil.c0 reflect.c0 blur.c0 images-test.c0 manipulate.c0
then display autolab's feedback by running:
   % autolab122 feedback

Creating a tarball to submit with autolab.cs.cmu.edu web interface:
   % tar -czvf handin.tgz imageutil.c0 reflect.c0 blur.c0 images-test.c0 manipulate.c0
