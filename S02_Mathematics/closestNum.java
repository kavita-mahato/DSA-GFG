package S02_Mathematics;

public class closestNum {
    static int closestNumber(int n, int m) {
        // code here
        int q = n / m;

        // First candidate (floor multiple)
        int n1 = m * q;

        // Second candidate (next multiple depending on sign)
        int n2;
        if ((n * m) > 0) {
            n2 = m * (q + 1);
        } else {
            n2 = m * (q - 1);
        }

        // Compare distances
        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        } else if (Math.abs(n - n1) > Math.abs(n - n2)) {
            return n2;
        } else {
            // If tie, choose max absolute value
            return Math.abs(n1) > Math.abs(n2) ? n1 : n2;
        }
    }
}
