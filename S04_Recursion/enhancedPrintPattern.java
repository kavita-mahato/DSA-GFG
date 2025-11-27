import java.util.ArrayList;

public class enhancedPrintPattern {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> pattern = new ArrayList<>();
        generatePattern(n, false, pattern);
        return pattern;

    }
    private void generatePattern(int current, boolean increasing, ArrayList<Integer> pattern) {
        pattern.add(current);

        if (current <= 0) {
            increasing = true;
        }

        int next = current + (increasing ? 5 : -5);
        if (!(increasing && next > pattern.get(0))) { 
            generatePattern(next, increasing, pattern);
        }
    }
}
