class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Integer k:hm.keySet()){
            if(hm.get(k)>nums.length/3){
                arr.add(k);
            }
        }
        return arr;
    }
}