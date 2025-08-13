import java.util.Arrays;

public class pairHasDiff {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int left = 0, right = 1;

        while (left < arr.length && right < arr.length) {
            if (left != right) {
                int diff = arr[right] - arr[left];
                if (diff == x) {
                    return true;
                } else if (diff < x) {
                    right++;
                } else {
                    left++;
                }
            } else {
                right++;
            }
        }
        return false;
    }
}
