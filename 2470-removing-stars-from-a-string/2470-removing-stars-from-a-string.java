class Solution 
{
    public String removeStars(String s) 
    {
        Stack <Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            
            if(ch == '*')
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        String res = "";
        while(!st.isEmpty())
        {
            res = st.pop() + res;
        }
        return res;
    }
}