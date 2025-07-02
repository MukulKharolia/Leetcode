class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        // if(nums)
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && max<=i && max<nums.length){
                return false;
            }
            if(i+nums[i]>max){
                max=i+nums[i];
            }
            if(max>=nums.length-1){
                return true;
            }
            
        }
        return false;
    }
}