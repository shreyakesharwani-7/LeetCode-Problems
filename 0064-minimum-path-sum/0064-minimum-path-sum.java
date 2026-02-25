class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] =- 1;
            }
        }
        return solve(grid, dp, n-1, m-1);
    }
    public int solve(int [][]arr, int[][]dp, int i, int j){
        if(i<0 || j <0){
            return Integer.MAX_VALUE;
        }
        if(i == 0 && j == 0){
            return arr[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int left = solve(arr, dp, i, j - 1);
        int up = solve(arr, dp, i - 1, j);
        return dp[i][j] = arr[i][j] +  Math.min(left, up);
    }
}