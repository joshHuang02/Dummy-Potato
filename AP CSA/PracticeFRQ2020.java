public class Hailstone{

/** Returns the length of a hailstone sequence that starts with n,

* as described in part (a).

* Precondition: n > 0

*/

    public static int hailstoneLength(int n) {
        int count = 1;
        int nextTerm = 0;
        while (n != 1) {
            if ( n % 2 == 0) {
                nextTerm = n/2;
                count ++;
            } else {
                nextTerm = 3*n + 1;
                count ++;
            }
            n = nextTerm;
        }
        return count;
    }



  /** Returns true if the hailstone sequence that starts with n is considered long

* and false otherwise, as described in part (b).

* Precondition: n > 0

*/
    public static boolean isLongSeq(int n) {
        return n > hailstoneLength(n);
    }



  /** Returns the proportion of the first n hailstone sequences that are considered long,

* as described in part (c).

* Precondition: n > 0

*/

    public static double propLong(int n) {
        double prop = 0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i)) prop += 1;
        }
        return prop / n;
    }

  // There may be instance variables, constructors, and methods not shown.

}