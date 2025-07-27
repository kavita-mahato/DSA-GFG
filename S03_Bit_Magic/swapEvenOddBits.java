package S03_Bit_Magic;

public class swapEvenOddBits {
    public static int swapBits(int n) {
        // code here
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
    }
}
