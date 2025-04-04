class Solution {
    public int findPeakElement(int[] nums) {
        int st=0;
        int en=nums.length-1;
        int mid=0;
        int n=nums.length;
        if(n==1){
            return 0;
        }
        if(n==2){
            if(nums[0]>nums[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        else if(nums[0]>nums[1]){
            return 0;
        }
        while(st<=en){
            mid=st-(st-en)/2;
            if(mid-1>=0 && mid+1<n && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid+1<n && nums[mid]<nums[mid+1]){
                st=mid+1;
            }
            else if(mid-1>=0 && nums[mid]<nums[mid-1]){
                en=mid-1;
            }


        }
        return -1;
    }
}