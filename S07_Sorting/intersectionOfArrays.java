import java.util.ArrayList;

public class intersectionOfArrays {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;
        while (i < m && j < n){
            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i] < arr2[j]) i++;
            else if (arr1[i] > arr2[j]) j++;
            else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
}
