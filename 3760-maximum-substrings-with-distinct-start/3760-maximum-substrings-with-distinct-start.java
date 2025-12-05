class Solution {
    public int maxDistinct(String s) {
        Set<Character> st = new HashSet<>();
        for(char c:s.toCharArray()){
            st.add(c);
        }
        return st.size();
    }
}