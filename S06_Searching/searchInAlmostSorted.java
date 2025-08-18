public class searchInAlmostSorted {
    public int findTarget(int arr[], int target) {
        // code here
        int n = arr.length;
        int low=0, high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] == target) return mid;
            
            else if (mid-1 >= low && arr[mid - 1] == target)
                return mid-1;
                
            else if (mid+1 <= high && arr[mid+1] == target)
                return mid+1;
                
            else if (arr[mid] > target) high = mid-2;
            else low = mid+2;
        }
        return -1;
    }
}
