class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        // for(Integer k:hm.keySet()){
        //     if(hm.get(k)>nums.length/2){
        //         return k;
        //     }
        // }
        return -1;
    }
}