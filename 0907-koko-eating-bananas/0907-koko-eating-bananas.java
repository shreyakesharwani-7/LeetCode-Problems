class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long hoursNeeded = hoursToEat(piles, mid);
            
            if (hoursNeeded <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return ans;
    }
    
    private long hoursToEat(int[] piles, int speed) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1L) / speed;  // note: speed - 1L to ensure long arithmetic
        }
        return hours;
    }
}
