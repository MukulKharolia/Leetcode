// using System;
// using System.Collections.Generic;
public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Dictionary<int,int> hm=new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++){
            // if(hm.Count>0 && hm.ContainsKey(nums[i]) && nums[i]*2==target){
            //     arr[0]=hm[nums[i]];
            //     arr[1]=i;
            //     return arr;
            // }
            // hm.Add(nums[i],i);
             int complement = target - nums[i];

            if (hm.ContainsKey(complement)) {
                return new int[] { hm[complement], i };
            }

            // store current value with its index
            hm[nums[i]] = i;
        }
        // for(int i=0;i<nums.Length;i++){
        //     if(hm.ContainsKey(target-nums[i])){
        //         arr[0]=hm[nums[i]];
        //         arr[1]=hm[nums[target-nums[i]]];
        //         break;
        //     }
        // }
        return arr;
    }
}