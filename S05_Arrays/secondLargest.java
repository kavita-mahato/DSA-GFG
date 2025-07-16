package S05_Arrays;

public class secondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
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
    }
}
