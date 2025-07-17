public class reversedArray {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int low=0, high=n-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
