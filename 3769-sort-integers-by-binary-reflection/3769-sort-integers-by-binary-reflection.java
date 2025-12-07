class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[]arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b) -> {
            int ra = reflect(a);
            int rb=reflect(b);
            if(ra!=rb){
                return ra-rb;
            }
            return a-b;
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
    int reflect(int x){
        String s = Integer.toBinaryString(x);
        String rev = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(rev,2);
    }
}