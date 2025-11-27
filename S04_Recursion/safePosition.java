public class safePosition {
    public int safePos(int n, int k) {
        // code here
        return josephus(n, k) + 1;
    }
    private int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }
}
