package S07_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {
    public static void main (String[] args) {
		//code here
		 Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();   // number of test cases
        while (test-- > 0) {
            String s = sc.next();   // input string
            
            // Convert to character array
            char[] arr = s.toCharArray();
            
            // Sort the array
            Arrays.sort(arr);
            
            // Convert back to string and print
            System.out.println(new String(arr));
        }        
       sc.close();
	}
}
