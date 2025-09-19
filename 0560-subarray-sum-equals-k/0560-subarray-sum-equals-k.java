class Solution 
{
    public int subarraySum(int[] nums, int k) 
    { 
        HashMap <Integer, Integer> mp = new HashMap<>();
        int sum = 0, count = 0;
        mp.put(0, 1);
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            int c = sum - k;
            if(mp.containsKey(c))
            {
                count += mp.get(c);
            }
            
                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}