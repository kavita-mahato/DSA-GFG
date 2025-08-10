public class countOcc {
    int countFreq(int[] arr, int target) {
        // code here
        int first = firstOcc(arr, target);
        if(first == -1) return 0;
        int last = lastOcc(arr, target);
        return (last - first + 1);
        
    }
    int firstOcc(int arr[], int target){
        int n = arr.length;
        int low=0, high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if (arr[mid] > target) high = mid - 1;
            else if (arr[mid] < target) low = mid + 1;
            else{
                if(mid==0 || arr[mid-1] != arr[mid]) return mid;
                else high = mid-1;
            }
        }
        return -1;
    }
    int lastOcc(int arr[], int target){
        int n = arr.length;
        int low=0, high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target) high = mid-1;
            else if(arr[mid] < target) low = mid+1;
            else{
                if(mid==n-1 || arr[mid+1] != arr[mid]) return mid;
                else low = mid+1;
            }
        }
        return -1;
    }
}
