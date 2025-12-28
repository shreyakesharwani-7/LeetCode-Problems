class Solution {
    public long maximumScore(int[] nums) {
      int n=nums.length;
        int[]sufix=new int[n];
        sufix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufix[i]=Math.min(nums[i],sufix[i+1]);
        }
        long prefixSum =0;
        long max =Long.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            prefixSum+=nums[i];
            long x=prefixSum-sufix[i+1];
            max=Math.max(max,x);
        }
        return max;
    }
}