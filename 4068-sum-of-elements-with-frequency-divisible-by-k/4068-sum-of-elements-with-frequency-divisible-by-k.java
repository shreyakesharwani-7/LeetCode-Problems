class Solution 
{
    public int sumDivisibleByK(int[] nums, int k) 
    {
       Arrays.sort(nums);
       int n = nums.length;
       int sum = 0; 
       int c = 1;
       for(int i = 1; i <= n; i++)
       {
            if(i < n && nums[i] == nums[i - 1])
            {
                c++;
            }
            else
            {
                if(c % k == 0)
                {
                    sum += nums[i - 1] * c;
                }
                c = 1;
            }
       }
       return sum;
    }
}