public class rightmostUnsetBit {
    static int setBit(int n) {
        // code here
        return n | (~n & (n+1));
    }
}
