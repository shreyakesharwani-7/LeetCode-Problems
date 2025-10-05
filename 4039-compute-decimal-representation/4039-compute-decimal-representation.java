class Solution 
{
    public int[] decimalRepresentation(int n) 
    {
        ArrayList<Integer> l = new ArrayList<>();
        int p = 1;
        while(n > 0)
        {
            int d = n % 10;
            if(d != 0)
            {
                l.add(d * p);
            }
            n /= 10;
            p *= 10;
        }
        Collections.reverse(l);
        int [] res = new int [l.size()];
        for(int i = 0; i <  l.size();i++)
        {
            res[i] = l.get(i);
        }
        return res;
        
    }
}