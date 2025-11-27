public class power {
    static int RecursivePower(int n, int p) {
        // Code here
        if (p == 0) return 1; 

        int halfPower = RecursivePower(n, p / 2);

        if (p % 2 == 0) {
            return halfPower * halfPower;  
        }else {
            return n * halfPower * halfPower; 
        }
    }
}
