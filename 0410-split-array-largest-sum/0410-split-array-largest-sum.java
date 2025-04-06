class Solution {
    public int splitArray(int[] nums, int k) {
        int max=0;
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
            max=Math.max(max,nums[i]);
        }

        return ans(nums,max,tsum,k);
    }

    public int ans(int[] nums,int st,int en,int k){
        int mid=0;
        
        while(st<=en){
            mid=st-(st-en)/2;
            int sum=0;
            int split=1;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>mid){
                    split++;
                    sum=nums[i];
                }
                else{
                    sum+=nums[i];
                }
            }
            if(split<=k){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return st;
    }
}