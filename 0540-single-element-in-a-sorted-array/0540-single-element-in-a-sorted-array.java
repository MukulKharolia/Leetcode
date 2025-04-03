class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int st=0;
        int en=nums.length-1;
        int mid=0;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums[st]!=nums[st+1]){
            return nums[st];
        }
        else if(nums[en]!=nums[en-1]){
            return nums[en];
        }
        while(st<=en){
            mid=st-(st-en)/2;
            // System.out.println("mid "+ mid);
            // int rem=(en-st+1)/2;
            if(mid-1>=0 && mid+1<n && nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2!=0){
                if(mid-1>=0 && nums[mid]==nums[mid-1]){
                    st=mid+1;
                }
                else{
                    en=mid-1;
                }
            }
            else if(mid%2==0){
                if(mid+1<n && nums[mid]==nums[mid+1]){
                    st=mid+1;
                }
                else{
                    en=mid+1;
                }
            }
            
        }

        return nums[mid];
    }
}