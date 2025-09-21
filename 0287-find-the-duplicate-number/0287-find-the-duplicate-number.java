class Solution {
    public int findDuplicate(int[] nums) {
        int low = 0, high = nums.length-1; 
        Arrays.sort(nums);
        while (low < high)
            {
                if(nums[low] == nums[low +1])
                    return nums[low];
                else
                    low++;
            }
        return-1;
    }
}