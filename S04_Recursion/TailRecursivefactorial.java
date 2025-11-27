public class TailRecursivefactorial {

    // Tail-recursive helper method
    private static long factTail(long n, long accumulator) {
        if (n == 0 || n == 1) {
            return accumulator;
        }
        return factTail(n - 1, accumulator * n);  // tail call
    }

    // Public method to be called
    public static long factorial(long n) {
        return factTail(n, 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}
