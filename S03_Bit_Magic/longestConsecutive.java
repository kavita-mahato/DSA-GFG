public class longestConsecutive {
    public static int maxConsecutiveOnes(int n) {
        // code here
        /*
        String binary = Integer.toBinaryString(n);  // Convert integer to binary string
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
        */

        // Enhanced approach
        int maxCount = 0;
        int currentCount = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
            n = n >> 1;
        }
        return maxCount;
    }
}
