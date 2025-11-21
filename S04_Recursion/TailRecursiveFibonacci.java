public class TailRecursiveFibonacci {

    // Tail-recursive helper
    private static long fibTail(long n, long a, long b) {
        if (n == 0) return a;     // a = F(n)
        if (n == 1) return b;     // b = F(n)
        return fibTail(n - 1, b, a + b);  // tail call
    }

    // Public method to get Fibonacci number
    public static long fibonacci(long n) {
        return fibTail(n, 0, 1);  // F(0)=0, F(1)=1
    }

    public static void main(String[] args) {
        long n = 10;
        System.out.println("Fibonacci number F(" + n + ") = " + fibonacci(n));
    }
}
