public class transition_Point {
    int transitionPoint(int arr[]) {
        // code here
        int low=0, high=arr.length-1;
        while (low <= high) {
            // To avoid the risk of integer overflow
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) 
                return mid; // first 1 found
            else if (arr[mid] == 0)
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
