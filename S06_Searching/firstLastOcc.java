import java.util.ArrayList;

public class firstLastOcc {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> range = new ArrayList<>(2);
        range.add(firstOcc(arr, x));
        range.add(lastOcc(arr, x));
        return range;
    }
    int firstOcc(int arr[], int x){
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > x) high = mid-1;
            else if(arr[mid] < x) low = mid+1;
            else{
                if(mid == 0 || arr[mid-1] != arr[mid]) return mid;
                else high = mid-1;
            }
        }
        return -1;
    }
    int lastOcc(int arr[], int x){
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > x) high = mid-1;
            else if(arr[mid] < x) low = mid+1;
            else{
                if(mid == n-1 || arr[mid+1] != arr[mid]) return mid;
                else low = mid+1;
            }
        }
        return -1;
    }
}
