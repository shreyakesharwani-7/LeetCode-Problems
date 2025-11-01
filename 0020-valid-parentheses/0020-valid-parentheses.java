import java.util.*;

class Solution 
{
    public boolean isValid(String s) 
    {
        Map<Character, Character> map = Map.of(
            ')', '(', 
            ']', '[', 
            '}', '{'
        );
        Stack <Character> st = new Stack<>();
        for (char ch : s.toCharArray()) 
        {
            if (map.containsValue(ch)) 
            {
                st.push(ch);
            }
            else if (map.containsKey(ch)) 
            {
                if (st.isEmpty() || st.pop() != map.get(ch)) 
                {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
