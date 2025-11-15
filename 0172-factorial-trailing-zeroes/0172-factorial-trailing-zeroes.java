class Solution 
{
    public int trailingZeroes(int n) 
    {
        if(n == 0 || n == 1) 
        {
            return 0;
        }
        int res = 0;
        long div = 5;
        while(div <= n)
        {
            res = res + n / (int)div;
            div *= 5;
        }
        return res;
    }
}