class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, ans = 0; 
        int high = n - 1;
        while(left <= high)
        {
            int mid = left + (high - left) / 2;
            if(citations[mid] >= n - mid)
            {
                ans = n - mid;
                high = mid - 1;
            }
            else 
            {
                left = mid + 1;
            }
        }
        return ans;
    }
}