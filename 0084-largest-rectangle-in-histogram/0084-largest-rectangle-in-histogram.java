class Solution {
    public int largestRectangleArea(int[] heights) {
        int n =heights.length;
        Stack<Integer> st =new Stack<>();
        int maxArea= 0;
        for (int i=0;i<=n;i++) {
            int currHeight = 0;
            if(i==n){
                currHeight=0;
            }
            else{
                currHeight=heights[i];
            }
            while (!st.isEmpty() && currHeight < heights[st.peek()]){
                int h = heights[st.pop()];
                int width;
                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }
                maxArea = Math.max(maxArea,h*width);
            }
            st.push(i);
        }
        return maxArea;
    }
}
