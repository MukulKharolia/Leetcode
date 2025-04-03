class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int[] suf=new int[n];
        suf[n-1]=nums[n-1];
        long ans=0;
        
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(nums[i],suf[i+1]);
        }

        for(int i=1;i<n-1;i++){
            // max=Math.max(max,nums[i]);
            ans=Math.max(ans,(long)(max-nums[i])*suf[i+1]);
            max=Math.max(max,nums[i]);
        }

        return ans;
    }
}