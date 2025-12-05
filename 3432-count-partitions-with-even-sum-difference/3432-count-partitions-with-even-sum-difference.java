class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int x : nums){
             sum += x;
        }
        int left = 0;
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            left += nums[i];
            int right = sum - left;
            if ((left % 2) == (right % 2)) 
            {
                c++;
            }
        }
        return c;
    }
}
