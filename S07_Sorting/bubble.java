import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] nums = {33, 21, 3, 5,1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        boolean swapped;
        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
        }
    }
    /*
    public static void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    } */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
