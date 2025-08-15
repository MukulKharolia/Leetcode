class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int l=0;
        int r=0;
        int z=0;
        while(r<nums.length){
            if(nums[r]==0){
                z++;
            }
            if(z>k){
                while(z!=k){
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
        return max;
    }
}