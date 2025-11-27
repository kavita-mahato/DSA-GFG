public class reverseBits {
    static Long reversedBits(Long x) {
        // code here
        long reversed = 0;
        for (int i = 0; i < 32; i++) {
            long bit = x & 1;
            reversed = (reversed << 1) | bit;
            x >>= 1;
        }
        return reversed;
    }
}
