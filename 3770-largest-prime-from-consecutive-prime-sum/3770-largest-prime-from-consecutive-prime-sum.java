class Solution {
    public int largestPrime(int n) {
        int sum=0;
        int res=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                sum+=i;
                if(sum>n)
                    break;
                if(isPrime(sum))
                {
                    res=sum;
                }
            }
        }
        return res;
    }
    boolean isPrime(int x){
        if(x<2)
        {
            return false;
        }
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}