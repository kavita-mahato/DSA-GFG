public class kthRotation {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if (mid>0 && arr[mid] < arr[mid-1]) 
                return mid;
            else if(arr[mid] < arr[high]) 
                high = mid-1;
            else    
                low = mid + 1;
        }
        return 0;
    }
}
