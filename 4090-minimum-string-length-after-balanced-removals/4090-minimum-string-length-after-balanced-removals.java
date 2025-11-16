class Solution 
{
    public int minLengthAfterRemovals(String s) 
    {
         int count1 = 0, count2 = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == 'a')
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }
        return Math.abs(count1 - count2);
    }
}