public class arrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        int n = arr.length;
        int currLdr = arr[n-1];
        leaders.add(currLdr);
        for(int i=n-2; i>=0; i--){
            if (arr[i] >= currLdr){
                currLdr = arr[i];
                leaders.add(currLdr);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
