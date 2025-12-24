import java.util.Arrays;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int res=0;
        for (int a : apple){
            res += a;
        }
        Arrays.sort(capacity);
        int sum=0,count= 0;
        for (int i=capacity.length-1 ;i >=0;i--){
            sum +=capacity[i];
            count++;
            if(sum >=res){
                return count;
            }
        }
        return count;
    }
}