class Solution {
    public boolean judgeSquareSum(int c) {
        long st=0;
        long en=sqrt(c);
        while(st<=en){
            long a=st*st;
            long b=en*en;
            if(a+b==c){
                return true;
            }
            if(a+b<c){
                st++;
            }
            else{
                en--;
            }
        }
        return false;
    }

    public int sqrt(int x){
        if(x==0 || x==1){
            return x;
        }
        long st=1;
        long en=x/2;
        long mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            long val=mid*mid;
            if(val<=x){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        return (int)en;
    }
}