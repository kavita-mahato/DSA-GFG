public class uniqueNumber{
    public int[] singleNum(int[] arr) {
        // Code here
        int xor = 0;
        int[] distinct = new int[2];

        for (int num : arr) {
            xor ^= num;
        }

        int rightmostSetBit = xor & -xor;

        int num1 = 0, num2 = 0;

        for (int num : arr) {
            if ((num & rightmostSetBit) != 0)
                num1 ^= num;
            else
                num2 ^= num;
        }

        distinct[0] = Math.min(num1, num2);
        distinct[1] = Math.max(num1, num2);
        return distinct;
    }
}