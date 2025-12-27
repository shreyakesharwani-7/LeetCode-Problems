class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> st1 =new HashSet<>();
        for(int x :arr){
            Set<Integer> st2=new HashSet<>();
            st2.add(x);
            for (int v : st1){
                st2.add(v|x);
            }
            st1 =st2;
            res.addAll(st1);
        }
        return res.size();
    }
}
