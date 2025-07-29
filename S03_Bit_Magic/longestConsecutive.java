package S03_Bit_Magic;

public class longestConsecutive {
    public static int maxConsecutiveOnes(int n) {
        // code here
        String binary = Integer.toBinaryString(n);  // Convert to binary string
        int maxCount = 0;
        int currentCount = 0;

        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;        
    }
}
