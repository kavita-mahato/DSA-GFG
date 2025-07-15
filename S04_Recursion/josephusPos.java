package S04_Recursion;

public class josephusPos {
    public int josephus(int n, int k) {
        // code here
        return safePosition(n, k) + 1;
    }
    private int safePosition(int n, int k) {
        if(n==1) return 0;
        else 
            return (safePosition(n-1,k)+k)%n;
    }
}
