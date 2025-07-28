package S02_Mathematics;

public class recursiveSequence {
    static long sequence(int n) {
        // code here
        long mod = 1_000_000_007;
        long sum = 0;
        int current = 1;
        for (int i = 1; i <= n; i++) {
            long product = 1;
            for (int j = 0; j < i; j++) {
                product = (product * current) % mod;
                current++;
            }
            sum = (sum + product) % mod;
        }
        return sum;
    }
}
