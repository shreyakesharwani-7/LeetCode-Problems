class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(solve(n-1, dp, cost),solve(n-2, dp, cost));
    }

    public int solve(int i, int[] dp, int[] cost) {
        if(i < 0)
            return 0;
        if(i == 0 || i == 1)
            return cost[i];
        if(dp[i] != -1)
            return dp[i];
        return dp[i] = cost[i] + Math.min(solve(i-1, dp, cost), solve(i-2, dp, cost));
    }
}