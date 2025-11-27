/* Given an unsigned integer n, You have  to swap all even-position bits with their rightside adjacent odd-position bits. */

public class swapEvenOddBits {
    public static int swapBits(int n) {
        // code here
        /*
        // Naive solution
        String binary = Integer.toBinaryString(n);

        // Pad with leading zeros to make length even
        if (binary.length() % 2 != 0) {
            binary = "0" + binary;
        }

        char[] bits = binary.toCharArray();

        // Swap every pair of bits
        for (int i = 0; i < bits.length; i += 2) {
            char temp = bits[i];
            bits[i] = bits[i + 1];
            bits[i + 1] = temp;
        }

        // Convert back to integer
        String swappedBinary = new String(bits);
        return Integer.parseInt(swappedBinary, 2);
        */

        // Optimized solution
        int result = 0;
        int totalBits = Integer.SIZE;

        for (int i = 0; i < totalBits; i += 2) {
            // Extract bit at even position i
            int evenBit = (n >> i) & 1;
            // Extract bit at odd position i+1
            int oddBit = (n >> (i + 1)) & 1;

            // Swap and place the bits
            result |= (oddBit << i); // Put oddBit in the even position i
            result |= (evenBit << (i + 1)); // Put evenBit in the odd position i+1
        }
        return result;
    }
}
