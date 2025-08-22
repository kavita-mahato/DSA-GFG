public class mergeWithoutExtra {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int m=a.length, n=b.length; 
        int i=m-1, j=0;
        
        while(i>=0 && j<n){
            if(a[i] >= b[j]){
                swap(a, b, i--, j++);
            } else {
                i--;
            }
        }
        // Sort both Arrays
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public void swap(int[] a,int[] b, int i, int j){
        int temp = b[j];
        b[j] = a[i];
        a[i] = temp;
    }
}