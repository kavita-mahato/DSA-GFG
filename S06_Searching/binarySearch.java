public class binarySearch {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k) return true;
            else if(arr[mid] > k)
                high = mid-1;
            else
                low = mid+1;
        }
        return false;
    }
}
