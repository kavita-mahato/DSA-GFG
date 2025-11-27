import java.util.ArrayList;

public class subSetSum {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> sumSet = new ArrayList<>();
        setElements(arr, 0, 0, sumSet);
        return sumSet;
    }

    private void setElements(int[] arr, int index, int currentSum, ArrayList<Integer> sumSet) {
        if (index == arr.length) {
            sumSet.add(currentSum);
            return;
        }

        // Include current element
        setElements(arr, index + 1, currentSum + arr[index], sumSet);

        // Exclude current element
        setElements(arr, index + 1, currentSum, sumSet);
    }
}