class Solution {
    public long repairCars(int[] ranks, int cars) {
        long st=1;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<ranks.length;i++){
            min=Math.min(min,ranks[i]);
        }
        long en=min*cars*cars;
        long mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            if(ans(ranks,cars,mid)){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return st;
    }

    public boolean ans(int[] arr,int k,long t){
        long tcar=0;
        for(int i=0;i<arr.length;i++){
            tcar+=(long)Math.sqrt(t/(double)arr[i]);
        }
        if(tcar>=k){
            return true;
        }
        return false;
    }
}