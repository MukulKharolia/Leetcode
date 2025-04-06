class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        long st=1;
        long en=x/2;
        long mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            
            if(mid*mid<=x){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        return (int)en;
    }
}                                       