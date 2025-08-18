public class onlySingle {
    int single(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }
            
            // If pairs match, single is on the right; otherwise, left
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        
        return arr[low];
    }
}
