class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if(k == 0)
            return n;
        int[]arr = nums.clone();
        Arrays.sort(arr);
        int res =0;
        for(int x:nums)
            {
                int idx=firstG(arr,x);
                int greater= n-idx;
                if(greater>=k)
               res++;}
        return res;
}
    int firstG(int[]arr, int target)    {
        int low = 0;
        int high= arr.length;
        while(low<high){
                int mid=(low+high) /2;
                if(arr[mid] <=target)
                    low = mid+ 1;
                else
                    high = mid;
            }
        return low;
    }
    
}