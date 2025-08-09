public class count_1s {
    public int countOnes(int[] arr) {
        int n = arr.length;
        
        // The array is in descending order so imagine it as ascending from the right.
        // Left pointer starts from the LAST index (right end of array)
        // Right pointer starts from the FIRST index (left end of array)
        int left = n - 1, right = 0;

        // Keep looping until the search space is valid
        while (left >= right) {
            // Find the middle index
            int mid = (left + right) / 2;

            // If mid element is 0, all elements to its right are also 0 (array is sorted in non-increasing order)
            // So, move 'left' pointer to search towards the left side
            if (arr[mid] == 0) {
                left = mid - 1;
            } 
            else {
                // arr[mid] == 1 → we are in the 1's section
                
                // If mid is the LAST index OR the next element is 0,
                // then mid is the LAST 1 in the array
                if (mid == n - 1 || arr[mid + 1] == 0)
                    // Count of 1's = index of last 1 + 1
                    return (mid + 1);

                // Otherwise, move the search to the right to find the LAST 1
                else {
                    right = mid + 1;
                }
            }
        }

        // If no 1's found, return 0
        return 0;
    }
}
