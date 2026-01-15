class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
         int sum=0;
          int n=points.length-1;
        for(int i=0;i<n;i++){
            int[] next=points[i+1];
            int[] curr=points[i];
            int x= Math.abs(next[0]-curr[0]);
            int  y=Math.abs(next[1]-curr[1]);
            sum+=Math.max(x,y);
        }
        return sum;
    }
}