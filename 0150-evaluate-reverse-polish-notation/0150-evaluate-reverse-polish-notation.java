class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens)
        {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
            {
                int n2 = st.pop();
                int n1 = st.pop();
                int res = 0;
                switch(s)
                {
                    case "+" : 
                        res = n1 + n2;
                        break;
                    case "-" : 
                        res = n1 - n2;
                        break;
                    case "*" : 
                        res = n1 * n2;
                        break;
                    case "/" : 
                        res = n1 / n2;
                        break;
                }
                st.push(res);
            }
            else
            {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}