class Solution {
    public int centeredSubarrays(int[] nums) {
        int[]arr=nums;
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                for(int k=i;k<=j;k++){
                    if(arr[k]==sum){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}