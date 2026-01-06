class Solution {
    public int numOfWays(int n) {
        long MOD= 1_000_000_007;
        long n1=6;
        long n2=6;
        for(int i=2;i<=n;i++){
            long x1= (2*n1+ 2* n2)% MOD;
            long x2 = (2*n1+ 3 *n2) % MOD;
            n1 =x1;
            n2=x2;
        }
        return (int)((n1 +n2) % MOD);
    }
}
