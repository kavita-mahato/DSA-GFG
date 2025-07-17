public class largestNum {
    public static int largest(int[] arr) {
        // code here
        int res =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[res])
                res = i;
        }
        return arr[res];
    }
}
