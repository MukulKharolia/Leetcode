class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        // int min=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
            // min=Math.min(min,piles[i]);
        }
        return ans(piles,max,h);
    }

    public int ans(int[] arr,int max,int h){
        int st=1;
        int en=max;
        int mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            int time=0;
            for(int i=0;i<arr.length;i++){
                time+=Math.ceil((double)arr[i]/(double)mid);
            }
            // if(time==h){
            //     return mid;
            // }
            if(time<=h){
                // st=mid+1;
                en=mid-1;
            }
            else{
                // en=mid-1;
                st=mid+1;
            }
        }
        return st;
    }
}