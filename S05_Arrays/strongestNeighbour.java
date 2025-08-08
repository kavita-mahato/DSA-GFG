public class strongestNeighbour {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> maxArr = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            maxArr.add(Math.max(arr[i], arr[i + 1]));
        }
        return maxArr;
    }
}
