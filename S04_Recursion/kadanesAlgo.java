package S04_Recursion;

public class kadanesAlgo {
    int maxSubarraySum(int[] arr) {
        // Code here
        if (arr.length == 0) {
            return 0;
        }
        int maxCurrent = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            if (maxCurrent > maxSum) {
                maxSum = maxCurrent;
            }
        }
        return maxSum;
    }
}
