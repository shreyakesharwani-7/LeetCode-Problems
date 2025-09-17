class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int [] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        res[0] = firstOccur(nums, target);
        res[1] = lastOccur(nums, target);
        return res;
    }
    int firstOccur(int[] nums, int target)
    {
    int low = 0, high = nums.length - 1, ans = -1;
            while(low <= high)        
            {
                int mid = low + (high - low) / 2;
                if(nums[mid] == target)
                {
                    ans = mid;
                    high = mid - 1;
                }
                 else if(nums[mid] < target)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            return ans;
    }
    int lastOccur(int [] nums, int target)
    {
        int low = 0, high = nums.length - 1, ans = -1;
         while(low <= high)        
            {
                int mid = low + (high - low) / 2;
                if(nums[mid] == target)
                {
                    ans = mid;
                    low = mid + 1 ;               
                }
                else if(nums[mid] < target)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            return ans;
    }
}