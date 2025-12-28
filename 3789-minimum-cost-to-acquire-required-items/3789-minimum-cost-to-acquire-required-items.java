class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long res=Long.MAX_VALUE;
        long a=need1;
        long b=need2;
        res=Math.min(res,a*cost1+b*cost2);
        long x =Math.min(a,b);
        res=Math.min(res,x*costBoth+(a-x)*cost1+(b-x)*cost2);
        x=Math.max(a,b);
        res=Math.min(res,x*costBoth);
        return res;
    }
}