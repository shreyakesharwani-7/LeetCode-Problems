class Solution {
    public int help(int n,int [] dp)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        else if(dp[n] != -1)
        {
            return dp[n];
        }
        return dp[n] = help(n-1,dp) + help(n-2,dp);
    }

    public int fib(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return help(n,dp);

    }
}