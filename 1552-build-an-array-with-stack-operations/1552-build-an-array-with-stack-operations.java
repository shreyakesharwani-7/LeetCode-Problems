class Solution 
{
    public List<String> buildArray(int[] target, int n) 
    {
        List<String> res = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for (int x : target) 
        {
            s.add(x);
        }
        
        int count = 0;  
        for (int i = 1; i <= n; i++) 
        {
            if (count == target.length) 
            {
                break;
            }
            res.add("Push");
            if (s.contains(i)) 
            {
                count++;
            } 
            else
            {
                
                res.add("Pop");
            }
        }
        
        return res;
    }
}
