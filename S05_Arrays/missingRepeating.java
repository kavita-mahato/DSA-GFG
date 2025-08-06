import java.util.ArrayList;

public class missingRepeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int duplicate = -1, missing = -1;

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                // Already visited => mark duplicate
                duplicate = Math.abs(arr[i]);
            } else {
                // Mark visited
                arr[index] = -arr[index];
            }
        }
        
        // Find the index which is not visited => mark missing
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}
