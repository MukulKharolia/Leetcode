class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int en=nums.length-1;
        int mid;
        while(st<=en){
            mid=(st+en)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
    }
}