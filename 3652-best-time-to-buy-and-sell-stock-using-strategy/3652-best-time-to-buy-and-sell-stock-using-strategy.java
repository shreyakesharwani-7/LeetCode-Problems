class Solution {
    public long maxProfit(int[] p, int[] s, int k) {
        int n = p.length;
        long base = 0;
        for (int i=0;i<n;i++){
            base +=(long) s[i] *p[i];
        }
        long[] a = new long[n+1];
        long[] b = new long[n+1];
        for (int i=0;i<n;i++) {
            a[i+1] =a[i]+ (long)s[i]*p[i];
            b[i+ 1] = b[i]+ p[i];
        }
        long best = 0;
        for (int i =0;i +k<=n;i++){
            int m = i+ k/2;
            int e =i+k;
            long x=a[e] -a[i];
            long y = b[e]- b[m];
            long g = y-x;
            if (g >best)best= g;
        }
        return base +best;
    }
}