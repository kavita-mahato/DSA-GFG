import java.util.ArrayList;

public class arrayDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1; 
            
            if(arr[index] < 0) {
                duplicates.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }
        return duplicates;
    }
}
