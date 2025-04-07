class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        Collections.sort(ans,(a,b)-> hm.get(a)==hm.get(b)? b-a:hm.get(a)-hm.get(b));
        return ans.stream().mapToInt(i -> i).toArray();
    }
}