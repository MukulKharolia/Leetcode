class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int tsum=0;
        int max=0;
        for(int i=0;i<weights.length;i++){
            tsum+=weights[i];
            max=Math.max(max,weights[i]);
        }

        int st=max;
        int en=tsum;
        int mid=0;

        while(st<=en){
            mid=st-(st-en)/2;
            int ndays=1;
            int load=0;
            for(int num:weights){
                if(num+load>mid){
                    ndays++;
                    load=num;
                }
                else{
                    load+=num;
                }
            }

            if(ndays<=days){
                en=mid-1;
                // st=mid+1;
            }
            else{
                // en=mid-1;
                st=mid+1;
            }
        }
        return st;
    }
}