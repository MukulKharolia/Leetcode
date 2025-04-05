class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        // int min=Integer.MAX_VALUE;
        int ans=-1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                // min=Math.min(min,nums[i]);
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
                if(hm.get(nums[i])>max){
                    max=hm.get(nums[i]);
                    ans=nums[i];
                }
                if(nums[i]!=ans && hm.get(nums[i])==hm.get(ans)){
                    if(ans>nums[i]){
                        ans=nums[i];
                    }
                }
            }
        }
        if(max==0){
            return -1;
        }
        // if(hm.get(min)==hm.get(ans)){
        //     return min;
        // }
        return ans;
    }
}