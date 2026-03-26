class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[]i:dp)
            Arrays.fill(i,-1);
        return (n+m)-2*lcs(word1,word2,dp,n-1,m-1);
    }
    public int lcs(String s1, String s2, int[][]dp, int i, int j){
        if(i<0||j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j]= 1+lcs(s1,s2,dp,i-1,j-1);
        else
            return dp[i][j] =Math.max(lcs(s1,s2,dp,i-1,j),lcs(s1,s2,dp,i,j-1));
    }
}