class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int dist=0;
        List<Integer> ans=new ArrayList<>();
        if(n<=2)
            return -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                    for(int k=j+1;k<n;k++){
                        if(nums[i]==nums[j]&&nums[j]==nums[k]){
                            dist=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                            ans.add(dist);
                        }
                    }
                }
            }
        for(int i=0;i<ans.size();i++){
            res=Math.min(ans.get(i),res);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}