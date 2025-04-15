class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr=new ArrayList<>();
        ans(0,nums,new ArrayList<>(),arr);
        return arr;
    }

    public void ans(int i,int nums[],List<Integer> sub,List<List<Integer>> arr){
        arr.add(new ArrayList<>(sub));
        for(int j=i;j<nums.length;j++){
            if(j!=i && nums[j]==nums[j-1]){
                continue;
            }
            sub.add(nums[j]);
            ans(j+1,nums,sub,arr);
            sub.remove(sub.size()-1);
        }
    }
}