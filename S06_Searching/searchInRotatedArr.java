public class searchInRotatedArr {
    int search(int[] arr, int key) {
        // code here
        int n = arr.length;
        int low=0, high=n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key) return mid;
            
            // Check if left half is sorted
            else if(arr[low] <= arr[mid]){
                if(key >= arr[low] && key < arr[mid]) high = mid-1;
                else low = mid+1;
            }
            
            // Check if left half is sorted
            else{
                if(key > arr[mid] && key <= arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}
