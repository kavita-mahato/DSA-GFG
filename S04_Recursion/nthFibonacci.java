public class nthFibonacci {
    static int fibonacci(int n) {
        // Code here
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
