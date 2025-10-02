class Solution 
{
    public int hIndex(int[] citations) 
    {
        Arrays.sort(citations);
        int ans = 0;
        for(int i = citations.length - 1; i >= 0; i--)
        {
            int h = citations.length - i;
           if(citations[i] >= h)
           {
                ans = h;
           } 
        }
        return ans;
    }
}