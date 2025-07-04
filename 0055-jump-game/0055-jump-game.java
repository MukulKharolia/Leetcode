class Solution {
    public boolean canJump(int[] nums) {
        // if(nums.length==1){
        //     return true;
        // }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                // System.out.println(i);
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