import java.util.ArrayList;

public class kthDistance {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        ArrayList<Integer> set = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // If current element exists in k distance
            if (set.contains(arr[i])) {
                return true;
            }

            // Add current element to the set
            set.add(arr[i]);

            // Maintain set size = k
            if (set.size() > k) {
                set.remove(0);  // Remove the index=0 element
            }
        }

        return false;
    }
}
