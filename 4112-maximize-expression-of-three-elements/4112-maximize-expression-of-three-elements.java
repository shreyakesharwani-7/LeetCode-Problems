class Solution 
{
    public int maximizeExpressionOfThree(int[] nums) 
    {
        int largest = Integer.MIN_VALUE;
        int n = nums.length;
        int min =Integer.MAX_VALUE;
        int secLar = Integer.MIN_VALUE;
        for(int i : nums)
        {
            if(i > largest)
            {
                secLar = largest;
                largest = i;
            }
            else if(i > secLar)
            {
                secLar = i;
            }
            if(i < min)
            {
                min = i;
            }
           
        }
        return largest + secLar - min;
    }
}