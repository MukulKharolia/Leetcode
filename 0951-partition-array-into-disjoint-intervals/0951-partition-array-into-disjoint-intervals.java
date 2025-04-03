class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;
        int[] suf=new int[n];
        suf[n-1]=nums[n-1];
        int max=nums[0];

        int ans=0;

        for(int i=n-2;i>=0;i--){
            suf[i]=Math.min(nums[i],suf[i+1]);
        }

        for(int i=0;i<n-1;i++){
            max=Math.max(max,nums[i]);
            if(max<=suf[i+1]){
                return i+1;
            }
            // else{
            //     ans++;
            // }
            // max=Math.max(max,nums[i]);
        }
        return -1;
    }
}