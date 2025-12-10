class Solution {
    public String removeKdigits(String num,int k) {
        if(k==0){
            return num;
        }
        if(num.length()==k){
            return "0";
            }
        Stack<Character>st=new Stack<>();
        for(char c:num.toCharArray()){
            while(!st.isEmpty()&&k>0&&st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
            }
        while(sb.length()>0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()== 0 ? "0" :sb.toString();
        
    }
}
