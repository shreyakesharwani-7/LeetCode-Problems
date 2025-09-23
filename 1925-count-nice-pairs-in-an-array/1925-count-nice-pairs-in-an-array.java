class Solution {
    public int rev(int num)
       {
            int rev = 0;
            while(num > 0)
            {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            return rev;
        }
    public int countNicePairs(int[] nums) 
    {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int mod = 1_000_000_007;

        for (int i = 0; i < n; i++) 
        {
            nums[i] = nums[i] - rev(nums[i]); 
        }
        int res = 0;
        for (int i = 0; i < n; i++)
        {
           res = (res + mp.getOrDefault(nums[i], 0)) % mod;
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

        }
        return res;
       

    }
}
