class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int st=0;
        int en=nums.length-1;
        int mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            if(nums[mid]==target){
                int s=mid;
                int e=mid;
                while(s>=0 && nums[s]==target){
                    s--;
                }
                while(e<=en && nums[e]==target){
                    e++;
                }
                ans[0]=s+1;
                ans[1]=e-1;
                return ans;
            }
            else if(nums[mid]>target){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
}