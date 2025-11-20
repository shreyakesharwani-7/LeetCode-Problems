class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        Set<Integer> s = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int n : nums)
        {
            if(s.contains(n))
            {
                res.add(n);
            }
            else
            {
                s.add(n);
            }
        }
        return res;
    }
}