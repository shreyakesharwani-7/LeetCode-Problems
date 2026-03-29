class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length(),m=p.length();
        int [][]dp=new int[n][m];
        for(int[]i:dp)
            Arrays.fill(i,-1);
        return solve(s,p,dp,n-1,m-1);
    }
    public boolean solve(String s, String p,int[][] dp, int i, int j){
        if(i<0 && j<0)
            return true;
            if(j<0)
                return false;
        if(i<0)
        {
            for(int k=0; k<=j;k++){
                if(p.charAt(k) != '*')
                    return false;
            }
            return true;
        }
        if(dp[i][j] != -1)
            return dp[i][j]==1;
        boolean ans;
        if(s.charAt(i) == p.charAt(j)||p.charAt(j) == '?' )
            ans= solve(s,p,dp,i-1,j-1);
       else if(p.charAt(j) =='*')
            ans = solve(s,p,dp,i,j-1) || solve(s,p,dp,i-1,j);
        else
            ans = false;
        dp[i][j] = ans ? 1 : 0;
        return ans;
    }
}
