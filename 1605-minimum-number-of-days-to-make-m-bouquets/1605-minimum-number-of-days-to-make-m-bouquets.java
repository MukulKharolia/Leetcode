class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long a=m;
        long b=k;
        long c=a*b;

        if(c>bloomDay.length){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        return ans(bloomDay,m,k,min,max);
    }

    public int ans(int[] arr,int m,int k,int st,int en){
        int mid=0;
        while(st<=en){
            int co=0;
            int ans=0;
            mid=st-(st-en)/2;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=mid){
                    co++;
                }
                else{
                    ans+=co/k;
                    co=0;
                }
            }
            ans+=co/k;
            if(ans<m){
                st=mid+1;
                // en=mid-1;
            }
            else{
                en=mid-1;
                // st=mid+1;
            }
        }
        return st;
    }
}