class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }
    public void backtrack(int i, int[]nums, List<Integer> curr, List<List<Integer>> res)
    {
        res.add(new ArrayList<>(curr));
        for(int j = i; j < nums.length; j++)
        {
            curr.add(nums[j]);
            backtrack(j + 1, nums, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}