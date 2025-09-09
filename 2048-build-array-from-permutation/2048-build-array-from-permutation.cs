public class Solution {
    public int[] BuildArray(int[] nums) {
        int n=nums.Length;
        int[] arr=new int[n];
        for(int i=0;i<nums.Length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}