class Solution {
    public int maxDigitRange(int[] nums) {
        int max1=-1;
        int sum =0;
        for(int num: nums){
            int temp= num;
            int min=9, max2=0;
            while(temp > 0){
                int d=temp%10;
                min = Math.min(min, d);
                max2 = Math.max(max2, d);
                temp/=10;
            }
            int range =max2-min;
            if(range>max1){
                max1=range;
                sum=num;
            }
            else if(range== max1){
                sum+= num;
            }
        }
        return sum;
    }
}