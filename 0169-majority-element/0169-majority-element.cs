public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int,int> dc=new Dictionary<int,int>();
        int max=0;
        int n=nums.Length;
        for(int i=0;i<nums.Length;i++){
            // dc.Add(nums[i],dc.GetValueOrDefault(nums[i],0)+1);
            // if(dc[nums[i]]>nums.Length/2){
            //     max=nums[i];
            // }
            if(!dc.ContainsKey(nums[i])){
                dc.Add(nums[i],1);
            }
            else{
                dc[nums[i]]=dc[nums[i]]+1;
            }
            if(dc[nums[i]]>n/2){
                max=nums[i];
            }
        }
        return max;

    }
}