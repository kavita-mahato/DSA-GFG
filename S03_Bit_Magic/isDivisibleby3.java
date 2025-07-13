package S03_Bit_Magic;

public class isDivisibleby3 {
    boolean isDivisible(String s) {
        // code here
        int rem=0;
        for (int i = 0; i < s.length(); i++) {
            int bit = s.charAt(i) - '0';
            rem = (rem * 2 + bit) % 3;
        }
        return rem == 0;
    }
}
