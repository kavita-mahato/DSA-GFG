package S04_Recursion;

public class digital_root{
    public static int digitalRoot(int n) {
        // code here
        if (n < 10) return n;
        
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digitalRoot(sum);
    }
}