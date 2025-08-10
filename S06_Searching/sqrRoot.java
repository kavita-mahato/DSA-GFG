public class sqrRoot {
    int floorSqrt(int n) {
        // code here
        int low=1, high=n, ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            int sqr = mid*mid;
            if(sqr == n) return mid;
            else if(sqr > n) high = mid-1;
            else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
