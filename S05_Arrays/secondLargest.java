public class secondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;
        for(int i=1; i<n; i++){
            if(largest < arr[i]){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
        /* 
        int res=-1, largest=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res])
                res = i;
            }
        }
        return res == -1 ? -1 : arr[res];
        */
    }
}
