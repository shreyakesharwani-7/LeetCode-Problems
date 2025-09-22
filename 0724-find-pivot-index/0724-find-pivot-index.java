class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
        int [] preSum = new int[n];
        int [] postSum = new int[n];
        preSum[0] = nums[0];
        for (int i = 1; i < n; i++) 
        {
            preSum[i] = preSum[i - 1] + nums[i];
        }

       postSum[n - 1] = nums[n - 1];
       for (int i = n - 2; i >= 0; i--) 
       {
            postSum[i] = postSum[i + 1] + nums[i];
       }
       for(int i = 0; i < n; i++)
       {
        if(preSum[i] == postSum[i])
        {
            return i;
        }
       }
       return -1;
    }
}
