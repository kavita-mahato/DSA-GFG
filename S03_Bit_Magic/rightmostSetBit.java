public class rightmostSetBit {
    static int posOfRightMostDiffBit(int m, int n) {
        // code here
        int num = m^n;
        if (num == 0) return -1;
        int pos = 1;
        while ((num & 1) == 0) {
            num >>= 1;
            pos++;
        }
        return pos;
    } 
}
