class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int z=0;z<nums.length;z++){
            if(hm.containsKey(nums[z])){
                int m=Math.abs(z-hm.get(nums[z]));
                if(m<=k){
                    return true;
                }
                else{
                    hm.put(nums[z],z);
                }
            }
            else{
                hm.put(nums[z],z);
            }
        }
        return false;
    }
}