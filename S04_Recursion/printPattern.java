package S04_Recursion;

import java.util.ArrayList;

public class printPattern {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> pattern = new ArrayList<Integer>();
        generatePattern(n, pattern);
        return pattern;

    }
    private void generatePattern(int n, ArrayList<Integer> pattern) {
        
        pattern.add(n);

        if (n <= 0) return;
        generatePattern(n - 5, pattern);
        pattern.add(n);
    }
}
