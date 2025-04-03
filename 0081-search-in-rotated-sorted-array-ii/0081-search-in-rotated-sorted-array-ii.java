class Solution {
    public boolean search(int[] nums, int target) {
        int st=0;
        int en=nums.length-1;
        int mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            if(nums[mid]==target){
                return true;
            }
            if(st!=mid && mid!=en && nums[st]==nums[mid] && nums[mid]==nums[en]){
                en--;
            }
            else if(nums[st]<=nums[mid]){
                if(nums[st]<=target && target<nums[mid]){
                    en=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else if(nums[mid]<=nums[en]){
                if(nums[mid]<target && target <=nums[en]){
                    st=mid+1;
                }
                else{
                    en=mid-1;
                }
            }
        }

        return false;
    }
}