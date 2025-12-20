class Solution {
    public int calculate(String s) {
        int n=s.length();
        int r=0,curr=1,num=0;
        Stack<Integer> st=new Stack<>();
        for (int i=0;i <n;i++) {
            char c = s.charAt(i);
            if (c >='0' && c<='9'){
                num = num*10 +(c-'0');
            } 
            else if (c=='+'){
                r +=curr*num;
                num =0;
                curr =1;
            } 
            else if(c=='-') {
                r+= curr*num;
                num= 0;
                curr= -1;
            } 
            else if(c=='('){
                st.push(r);
                st.push(curr);
                r=0;
                curr=1;
            } 
            else if(c==')'){
                r += curr*num;
                num =0;
                r *=st.pop();
                r +=st.pop();
            }
        }
        return r +curr* num;
    }
}