class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                count++;
                hm.put(count,i);
            }
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(queries[i]>hm.size()){
                ans[i]=-1;
            }
            else{
                ans[i]=hm.get(queries[i]);
            }
        }
        return ans;
    }
}