public class TailRecursiveSum {

    // Tail-recursive helper method
    private static int sumTail(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return sumTail(n - 1, sum + n);  // tail call
    }

    // Public method to be called
    public static int naturalSum(int n) {
        return sumTail(n, 0);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " natural numbers = " + naturalSum(n));
    }
}
