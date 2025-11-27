import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class powerSet {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> powerSet = new ArrayList<>();
        int n = s.length();
        int size = 1<<n;
        for(int i=0; i<size; i++){
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    temp.append(s.charAt(j));
                }
            }
            powerSet.add(temp.toString());
        }
        Collections.sort(powerSet);
        return powerSet;
    }
}
