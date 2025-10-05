class Solution 
{
    public int alternatingSum(int[] nums) 
    {
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
            {
                if(i == 0)
                {
                    ans = nums[i] + ans;
                }
                else if(i % 2 == 0)
                {
                    ans = ans + nums[i];
                }
                else
                {
                    ans = ans - nums[i];
                }
            }
        return ans;
    }
}