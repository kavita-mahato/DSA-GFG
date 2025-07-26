public class maxIndexDifference {
    int maxIndexDiff(int arr[]) {
        // code here
        int result = 0 ;
        int n = arr.length;
        
        for(int i = 0; i<n-1; i++){
            for(int j = i; j<n; j++){
                if(arr[i] <= arr[j]) 
                result = Math.max(result,(j-i));
            }
        }
        return result;
    }
}
