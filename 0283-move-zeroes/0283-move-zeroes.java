class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,n=nums.length;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                
            }
        }
    }
}