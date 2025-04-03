class Solution {
    public int sumOfBeauties(int[] nums) {
        int n=nums.length;
        // int[] pre=new int[n];
        int[] suf=new int[n];

        // pre[0]=nums[0];
        suf[n-1]=nums[n-1];
        int max=nums[0];
        int min=nums[n-1];

        // for(int i=1;i<nums.length;i++){
        //     max=Math.max(max,nums[i]);
        //     pre[i]=max;
        // }

        for(int i=n-2;i>=0;i--){
            min=Math.min(min,nums[i]);
            suf[i]=min;
        }

        int sum=0;

        for(int i=1;i<n-1;i++){
            //contition 1
            if(max<nums[i] && nums[i]<suf[i+1]){
                sum=sum+2;
            }
            //condition 2
            else if(nums[i-1]<nums[i] && nums[i]<nums[i+1]){
                sum++;
            }
            max=Math.max(max,nums[i]);
        }

        return sum;
    }
}