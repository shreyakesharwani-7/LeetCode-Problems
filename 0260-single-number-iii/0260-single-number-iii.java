class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i : nums)
        {
            xor ^= i;
        }
        int diffBit = xor & (-xor);
        int[] arr = new int[2];
        for (int i : nums) {
            if ((i & diffBit) == 0) 
            {
                arr[0] ^= i;
            } 
            else 
            {
                arr[1] ^= i;
            }
        }
        return arr;
    }
}
