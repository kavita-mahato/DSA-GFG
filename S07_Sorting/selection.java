import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] nums = {33, 21, 3, 5,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0; i < n-1; i++){
            int minInd = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minInd])
                    minInd = j;
            }
            swap(arr, minInd, i);
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
