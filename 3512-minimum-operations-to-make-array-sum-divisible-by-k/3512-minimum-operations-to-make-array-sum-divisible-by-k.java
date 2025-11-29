class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int sum = 0, mod = 0; 
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            mod = sum % k;
        }
        return mod;
    }
}