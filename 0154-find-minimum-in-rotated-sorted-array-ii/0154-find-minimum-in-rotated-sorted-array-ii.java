class Solution 
{
    public int findMin(int[] nums) 
    {
        int low = 0, high = nums.length - 1;
        int ans = nums[0];
        while(low <= high)
        {
            int mid = low + (high -low) / 2;
            if(ans > nums[low])
            {
                ans = nums[low];
            }
            else
            {
                low++;
            }
        }
        return ans;
    }
}