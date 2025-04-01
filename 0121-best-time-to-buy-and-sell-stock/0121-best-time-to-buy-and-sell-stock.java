class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] min=new int[n];
        int[] max=new int[n];
        min[0]=prices[0];
        max[n-1]=prices[n-1];
        for(int i=1;i<prices.length;i++){
            min[i]=Math.min(min[i-1],prices[i]);
        }
        for(int i=n-2;i>=0;i--){
            max[i]=Math.max(max[i+1],prices[i]);
        }
        int mnum=0;
        for(int i=0;i<n;i++){
            mnum=Math.max(max[i]-min[i],mnum);
        }
        if(mnum<=0){
            return 0;
        }
        return mnum;
    }
}