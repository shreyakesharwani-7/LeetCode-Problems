class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        HashSet<Integer> s = new HashSet<>();
        for(int n : nums) 
        {
            s.add(n);
        }
        for(int i = 1; i <= nums.length + 1; i++) 
        {
            if(!s.contains(i)) 
            {
                return i;
            }
        }
        return 1; 
    }
}
