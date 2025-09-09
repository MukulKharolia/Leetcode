public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int l=0;
        int r=0;
        int n=nums.Length;
        while(r<n){
            if(l<r && nums[l]!=nums[r]){
                l++;
                nums[l]=nums[r];
                // l++;
            }
            else{
                r++;
            }
        }
        return l+1;

    }
}