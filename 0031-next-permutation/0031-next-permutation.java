class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length-1;
        int ind=-1;
        for(int i=n;i>=1;i--){
            if(nums[i]>nums[i-1]){
                ind=i-1;
                break;
            }
        }
        if(ind == -1){
            reverse(nums,0,n);
            return;
        }

        for(int i=n;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        reverse(nums,ind+1,n);
        return;
    }

    public void reverse(int[] arr,int st,int en){
        while(st<=en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
    }
}