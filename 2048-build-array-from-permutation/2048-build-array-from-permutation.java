class Solution {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(i,nums[i]);
        }
        for(int j=0;j<ans.length;j++){
            ans[j]=hm.get(hm.get(j));
        }
        return ans;
    }
}