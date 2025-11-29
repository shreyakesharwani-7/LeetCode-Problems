class Solution {
    public int getKth(int lo, int hi, int k) {
        int ans[][] = new int [hi-lo+1][2];
        int j=0;
        for(int i=lo;i<=hi;i++)
        {
            ans[j][0]=i;
            ans[j++][1]=power(i);
        }
        Arrays.sort(ans, (a,b)->{
            return a[1]-b[1];
        });
        return ans[k-1][0];
        
    }
    private int power(int x)
    {
        int count=0;
        while(x!=1){
            if(x % 2 == 0)
            {
                x = x/2;
            }
            else
            {
                x =  x * 3 +1;
            }
            count++;
        }
        return count;
    }
}