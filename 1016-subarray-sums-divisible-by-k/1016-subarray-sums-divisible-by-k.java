class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int ans=0;
        int rem=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem = (sum % k+k) % k;
            if(hm.containsKey(rem)){
                // System.out.println(sum+"  "+hm.get(sum%k));
                ans+=hm.get(rem);
            }
            
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        // System.out.println(-1%2);
        return ans;
    }
}