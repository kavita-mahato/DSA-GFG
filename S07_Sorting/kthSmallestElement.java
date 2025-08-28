public class kthSmallestElement {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        
        // Step 1: Find max element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // Step 2: Make frequency array
        int[] freq = new int[max + 1];
        for (int num : arr) {
            freq[num]++;
        }

        // Step 3: Traverse freq and find kth element
        int count = 0;
        for (int i = 0; i <= max; i++) {
            count += freq[i];
            if (count >= k) {
                return i;
            }
        }
        return -1; // if not found (shouldn’t happen as k < arr.length)
    }
}
