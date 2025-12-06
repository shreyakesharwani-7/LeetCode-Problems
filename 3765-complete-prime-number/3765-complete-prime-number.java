class Solution {
    public boolean completePrime(int num) {
       String s = String.valueOf(num);
        for(int i=1;i<s.length();i++){
           int prefix=Integer.parseInt(s.substring(0,i));
            if(!isPrime(prefix))
                
            {
                return false;
            }
        }
        for(int i=0;i<s.length();i++){
            int sufix =Integer.parseInt(s.substring(i));
            if(!isPrime(sufix))
                return false;
        }
        return true;
    }
    boolean isPrime(int n){
        if(n<=1)
        {
            return false;
        }
        if(n<=3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}