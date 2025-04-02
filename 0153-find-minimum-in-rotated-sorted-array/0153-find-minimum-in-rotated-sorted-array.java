class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int st=0;
        int en=nums.length-1;
        int mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            if(mid-1<0 && nums[mid]<nums[mid+1]){
                return nums[mid];
            }
            else if(mid-1>=0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[st]<=nums[mid] && nums[mid]>=nums[en]){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }

        return nums[mid];
    }
}