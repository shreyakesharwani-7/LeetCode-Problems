class Solution {
  public String getLCS(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while(i > 0 && j > 0) {
            if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i - 1));
                i--; j--;
            } else if(dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return sb.reverse().toString();
    }

    public String shortestCommonSupersequence(String s1, String s2) {
        String lcs = getLCS(s1, s2);
        int i = 0, j = 0;
        StringBuilder scs = new StringBuilder();
        for(char c : lcs.toCharArray()) {
            while(s1.charAt(i) != c) {
                scs.append(s1.charAt(i));
                i++;
            }
            while(s2.charAt(j) != c) {
                scs.append(s2.charAt(j));
                j++;
            }
            scs.append(c);
            i++; j++;
        }
        while(i < s1.length()) {
            scs.append(s1.charAt(i++));
        }
        while(j < s2.length()) {
            scs.append(s2.charAt(j++));
        }
        return scs.toString();
    }
}