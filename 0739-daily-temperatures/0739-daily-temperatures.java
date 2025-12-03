class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st=new Stack<>();
        int[] temp=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty()){
                temp[i]=-1;
            }
            else
            temp[i]=st.peek();
            st.push(i);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(temp[i]==-1)
            res[i]=0;
            else
            res[i]=temp[i]-i;
        }
        return res;
    }
}