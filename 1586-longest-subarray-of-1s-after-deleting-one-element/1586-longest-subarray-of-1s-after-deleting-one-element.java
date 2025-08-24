class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int l=0;
        int r=0;
        int z=0;
        while(r<nums.length){
            if(nums[r]==0){
                z++;
            }
            if(z>1){
                while(z!=1){
                    if(nums[l]==0){
                        z--;
                    }
                    l++;
                }
            }
            int len=r-l+1;
            max=Math.max(max,len);
            r++;
        }
        return max-1;
    }
}