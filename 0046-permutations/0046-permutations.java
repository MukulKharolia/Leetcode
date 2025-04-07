class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        ans(nums,0,arr);
        return arr;
    }
    public void ans(int[] nums,int st,List<List<Integer>> arr){
        if(st==nums.length){
            List<Integer> res=new ArrayList<>();
            for(int num:nums){
                res.add(num);
            }
            arr.add(res);
            return;
        }
        for(int i=st;i<nums.length;i++){
            swap(nums,st,i);
            ans(nums,st+1,arr);
            swap(nums,st,i);
        }
    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}