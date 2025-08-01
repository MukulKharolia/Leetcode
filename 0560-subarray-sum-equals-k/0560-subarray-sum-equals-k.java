class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int ans=0;
        hm.put(0,1);
        for(int i:nums){
            sum=sum+i;
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
                // continue;
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        // System.out.println(hm);
        return ans;
    }
}