public class rotatedMinimum {
    public int findMin(int[] arr) {
        // complete the function here
        int n = arr.length;
        int left=0, right=n-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[n-1] && (mid == 0 || arr[mid] < arr[mid-1])) 
                return arr[mid];
            else if (arr[mid] < arr[n-1]) right = mid-1;
            else left = mid + 1;
        }
        return arr[n-1];
    }
}
