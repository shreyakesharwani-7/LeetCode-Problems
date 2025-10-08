class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i : nums)
        {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
         for (int key : mp.keySet()) {
            if (mp.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}