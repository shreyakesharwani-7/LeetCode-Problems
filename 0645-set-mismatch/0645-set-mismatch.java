class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int dup = -1, mis = -1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++)    
        {
            if(nums[i] == nums[i - 1])
            {
                dup = nums[i];
            }
        }
         for(int i = 1; i <= nums.length; i++) 
        {
            if(Arrays.binarySearch(nums, i) < 0)
            {
                mis = i;
                break;
            }
        }
        return new int[]{dup, mis};
    }
}