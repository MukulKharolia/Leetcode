class Solution {
    int mod=1000000007;
    public int countGoodNumbers(long n) {
        long a=pow(5,(n+1)/2);
        long b=pow(4,n/2);
        return (int)((a*b)%mod);
    }

    public long pow(long x,long n){
        x=x%mod;
        long ans=1;
        while(n>0){
            if(n%2==1){
                ans=(ans*x)%mod;
                n=n-1;
            }
            else{
                x=(x*x)%mod;
                n=n/2;
            }
        }
        return ans;
    }
}