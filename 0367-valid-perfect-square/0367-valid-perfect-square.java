class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1){
            return true;
        }
        long st=1;
        long en=num/2;
        long mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            long v=mid*mid;
            if(v==num){
                return true;
            }
            else if(v<=num){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        } 
        return false;
    }
}