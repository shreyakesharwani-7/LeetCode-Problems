class Solution 
{
    public int diagonalPrime(int[][] nums) 
    {
        int n = nums.length;
        int lar = 0;
        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < n; j++)
            {
                if (i == j || i + j == n - 1)
                {
                    int ans = nums[i][j];
                    if (isPrime(ans)) 
                    {
                        lar = Math.max(lar, ans);
                    }   
                }
            }
        }
        return lar;
    }
    boolean isPrime(int n) 
    { 
        if (n == 2)
        {
            return true;
        } 
        if (n < 2 || n % 2 == 0)
        {
            return false;
        } 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}