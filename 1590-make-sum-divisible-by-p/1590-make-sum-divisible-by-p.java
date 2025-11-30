class Solution 
{
    public int minSubarray(int[] nums, int p) 
    {
        long sum = 0;
        for (int x : nums)
        {
            sum += x;
        } 
        int target = (int)(sum % p);
        if (target == 0)
            return 0;   
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        long a= 0;
        int res = nums.length;
        for (int i=0; i<nums.length; i++) 
        {
            a = (a + nums[i]) % p;
            int n = (int)((a -target +p)% p);
            if (mp.containsKey(n)) 
            {
                res = Math.min(res, i -mp.get(n));
            }
            mp.put((int)a,i);
        }

        return res == nums.length ? -1 : res;
    }
}
