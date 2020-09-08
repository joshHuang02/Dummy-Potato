public class sum{
    public static void main(String[] args) {
        System.out.println(sum_numbers(2));
    }
    public static int sum_numbers(int n) {
        int a = n;
        int sum = 0;
        if (sum == a * (a + 1) / 2 - n * (n + 1) / 2) {}
        while (n > 0) {
            sum += n;
            n = n - 1;
        }
        return sum;
        //return n * (n + 1) / 2;
        //return n * (n + 1) / 2 - (n * (n + 1) / 2 - 1 * n);
    }

    
}