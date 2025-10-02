class Solution {
    public double myPow(double x, int n) 
    {
        long N = n;
        if(N < 0)
        {
           x = 1 / x;
            N = -N;
        }
    return Math.pow(x,N);
    }
}