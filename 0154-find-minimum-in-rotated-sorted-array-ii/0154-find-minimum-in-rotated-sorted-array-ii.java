class Solution {
    public int findMin(int[] nums) {
        int st=0;
        int en=nums.length-1;
        int mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(nums[st]<=nums[mid] && nums[en]<nums[mid]){
                st=mid+1;
            }else if(nums[mid]<nums[en]){
                en=mid;
            }
            else{
                en--;
            }
        }
        // System.out.println(mid);
        return nums[mid];
    }
    // public int search(int[] arr,int st,int en){
    //     while(st<=en){
    //         mid=st-(st-en)/2;
    //         if(mid>0 && nums[mid-1]>nums[mid]){
    //             return nums[mid];
    //         }

    //     }
    // }
}