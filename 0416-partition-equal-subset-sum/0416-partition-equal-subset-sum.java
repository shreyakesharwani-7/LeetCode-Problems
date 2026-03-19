class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)
            sum+=num;   
        if(sum%2!=0)
            return false;
        int n = nums.length;
        int target = sum/2;
        int[][] dp = new int[n][target+1];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return solve(nums, n-1, dp, target);
    }
    public static boolean solve(int[] arr, int i, int[][] dp, int sum){
        if(sum == 0) 
            return true;
        if(i < 0) 
            return false;
        
        if(dp[i][sum] != -1)
            return dp[i][sum] == 1;
        
        boolean pick = false;
        if(arr[i] <= sum)
            pick = solve(arr, i-1, dp, sum - arr[i]);
        
        boolean npick = solve(arr, i-1, dp, sum);
        
        dp[i][sum] = (pick || npick) ? 1 : 0;
        
        return pick || npick;
    }
}