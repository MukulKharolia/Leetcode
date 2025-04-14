class Solution {
    public int rob(int[] nums) {
        int n=nums.length-1;
        if(n==0){
            return nums[0];
        }
        if(n==1){
            return Math.max(nums[0],nums[1]);
        }
        // int[] f=new int[n+1];
        return Math.max(ans(0,n-1,nums),ans(1,n,nums));
    }

    public int ans(int s,int e,int[] nums){
        int j=s;
        int curr=0;
        int prev=nums[s];
        int prev2=0;
        for(int i=s+1;i<=e;i++){
            int p=nums[i];
            if(i>j+1){
                p+=prev2;
            }
            int skip=prev;
            curr=Math.max(p,skip);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}