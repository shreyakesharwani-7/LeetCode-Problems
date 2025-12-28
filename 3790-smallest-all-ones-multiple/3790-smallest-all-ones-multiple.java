class Solution {
    public int minAllOneMultiple(int k) {
        int x=k;
        if(x%2==0||x%5==0){
            return -1;
        }
        int rem=0;
        for(int i=1;i<=x;i++){
            int rev=rem*10+1;
            rem=rev%x;
            if(rem==0){
                return i;
            }
        }
        return -1;
    }
}