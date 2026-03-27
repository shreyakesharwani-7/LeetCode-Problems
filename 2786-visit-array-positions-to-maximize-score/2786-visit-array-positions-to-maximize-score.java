class Solution {
    public long maxScore(int[] nums, int x) {
        int n=nums.length;
        Long[][]dp = new Long[n][2];
        int val =nums[0] % 2;
        return nums[0] + solve(1,val,nums,x,dp);
    }
    public long solve(int i,int parity,int[] nums,int x,Long[][] dp){
        if (i == nums.length) 
            return 0;
        if (dp[i][parity] != null) 
            return dp[i][parity];
        long skip = solve(i+1, parity,nums,x,dp);
        int curr= nums[i] %2;
        long pick= nums[i];
        if (curr!= parity)
            pick-=x;
        pick +=solve(i+1,curr,nums,x,dp);

        return dp[i][parity] =Math.max(skip,pick);
    }
}