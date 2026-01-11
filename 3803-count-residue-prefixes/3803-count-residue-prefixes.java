class Solution {
    public int residuePrefixes(String s) {
        int count =0;
        HashSet<Character> st = new HashSet<>();
        for(int i =0;i<s.length();i++){
            st.add(s.charAt(i));
            int dist=st.size();
            int mod=(i+1)%3;
            if(dist==mod){
                count++;
            }
        }
        return count;
    }
}