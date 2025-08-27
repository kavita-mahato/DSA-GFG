import java.util.ArrayList;

public class union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            // Skip duplicates in a[]
            while (i > 0 && i < n && a[i] == a[i - 1]) i++;
            // Skip duplicates in b[]
            while (j > 0 && j < m && b[j] == b[j - 1]) j++;

            if (i >= n || j >= m) break;

            if (a[i] < b[j]) {
                union.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                union.add(b[j]);
                j++;
            } else { // equal
                union.add(a[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of a[]
        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                union.add(a[i]);
            }
            i++;
        }

        // Add remaining elements of b[]
        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }
}
