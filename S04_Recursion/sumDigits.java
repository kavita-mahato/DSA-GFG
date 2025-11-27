public class sumDigits {
    public static int sumOfDigits(int n) {
        // Code here
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
}
