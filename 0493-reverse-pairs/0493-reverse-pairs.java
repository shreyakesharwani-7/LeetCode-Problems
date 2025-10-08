class Solution {
    public int reversePairs(int[] nums) 
    {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int l, int r) 
    {
        if (l >= r)
        {
            return 0;
        } 
        int mid = (l + r) / 2;
        int count = mergeSort(nums, l, mid) + mergeSort(nums, mid + 1, r);

    
        int j = mid + 1;
        for (int i = l; i <= mid; i++)
        {
            while (j <= r && (long)nums[i] > 2L * nums[j]) 
            {
                j++;
            }
            count += (j - (mid + 1));
        }

        
        merge(nums, l, mid, r);
        return count;
    }

    private void merge(int[] nums, int l, int mid, int r) 
    {
        List<Integer> temp = new ArrayList<>();
        int i = l, j = mid + 1;

        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j])
            {
               temp.add(nums[i++]); 
            } 
            else
            {
                temp.add(nums[j++]);
            }
        }
        while (i <= mid)
        { 
            temp.add(nums[i++]);
        }
        while (j <= r)
        {
            temp.add(nums[j++]);
        } 

        for (int k = l; k <= r; k++) 
        {
            nums[k] = temp.get(k - l);
        }
    }
}
