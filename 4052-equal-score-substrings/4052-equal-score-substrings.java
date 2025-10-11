class Solution 
{
    public boolean scoreBalance(String s) 
    {
        int t = 0;
        for(char c : s.toCharArray())
            {
                t += c - 'a' + 1;
            }
        int lSum = 0;
        for(int i = 0; i < s.length() - 1; i++)
            {
                lSum += s.charAt(i) - 'a' + 1;
                int rSum = t - lSum;
                if(lSum == rSum)
                {
                    return true;
                }
            }
        return false;
    }
}