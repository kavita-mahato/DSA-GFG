public class printGFG {
    void printGfg(int N) {
        // code here
        if (N == 0) return;
        System.out.print("GFG" + " "); 
        printGfg(N-1);
    }
}
