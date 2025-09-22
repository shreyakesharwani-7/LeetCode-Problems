class Solution 
{
    public long countBadPairs(int[] nums) 
    {
        int n = nums.length;
        long t =  (long)n *(n-1)/2;
        long good = 0;
        HashMap <Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int key  = nums[i] - i;
            if(mp.containsKey(key))
            {
                good += mp.get(key);
            }
            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }
        long bad = t - good;
        return bad;
    }
}