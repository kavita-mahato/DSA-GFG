package S04_Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class stringPermutation {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // sort to bring duplicates together
        permute(chars, 0, result);
        return result;
    }

    private void permute(char[] chars, int index, ArrayList<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            if (shouldSwap(chars, index, i)) {
                swap(chars, index, i);
                permute(chars, index + 1, result);
                swap(chars, index, i);
            }
        }
    }

    private boolean shouldSwap(char[] chars, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (chars[i] == chars[curr]) return false;
        }
        return true;
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
