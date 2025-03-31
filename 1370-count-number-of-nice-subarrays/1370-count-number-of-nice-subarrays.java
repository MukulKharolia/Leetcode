class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int sum=0;

        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                sum++;
            }
            count+=hm.getOrDefault(sum-k,0);

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }

        return count;
    }
}