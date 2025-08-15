public class minDivisor {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int n = arr.length;
        if(n > k) return -1;
        int max = arr[0];
        for (int num : arr) { 
            if (num > max) {
                max = num;
            }
        }
        int low=0, high=max, ans=-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(sumCeiling(arr,mid) <= k){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    int sumCeiling(int[] arr, int div){
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum += Math.ceil((double) arr[i]/ (double) div);
        }
        return sum;
    }
}
