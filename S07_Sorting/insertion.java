package S07_Sorting;

public class insertion {
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
