public class extraElement {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int left=0, right=b.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(a[mid] != b[mid] && (mid == 0 || a[mid-1] == b[mid-1])) 
                return mid;
            else if (a[mid] != b[mid]) right = mid-1;
            else left = mid + 1;
        }
        return b.length;
    }
}
