class Solution 
{   
private boolean canFind(int[] prefix, int len, int target) 
{
    int n = prefix.length - 1; 
    for (int i = len; i <= n; i++) 
    {
        int sum = prefix[i] - prefix[i - len];
        if (sum >= target) 
        {
            return true;
        }
    }
    return false;
}
    public int minSubArrayLen(int target, int[] nums) 
    {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) 
        {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
        int low = 1, high = n;
        int ans = 0; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFind(prefix, mid, target)) 
            {
                ans = mid;       
                high = mid - 1; 
            }
            else 
            {
                low = mid + 1; 
            }
        }

        return ans;
    }
}