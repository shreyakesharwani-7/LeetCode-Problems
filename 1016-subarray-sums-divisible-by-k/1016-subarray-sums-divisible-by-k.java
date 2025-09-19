class Solution 
{
    public int subarraysDivByK(int[] nums, int k) 
    {
        HashMap <Integer, Integer> mp = new HashMap<>();
        int sum = 0, count = 0;
        mp.put(0, 1);
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            int c = ((sum % k)+k)%k;
            if(mp.containsKey(c))
            {
                count += mp.get(c);
            }
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        return count;
    }
}