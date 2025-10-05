class Solution 
{
    public int longestSubsequence(int[] nums) 
    {
        int[] d = nums;
        int totalXor = 0;
        for(int n : d)
        {
            totalXor ^= n;
        }
        boolean zero = true;
        for(int n : d)
            {
                if(n != 0)
                {
                    zero = false;
                    break;
                }
            }
        if(totalXor != 0)
        {
            return d.length;
        }
        if(zero)
        {
            return 0;
        }
        return d.length - 1;
    }
}