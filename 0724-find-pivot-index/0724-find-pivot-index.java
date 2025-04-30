class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre=new int[nums.length];
        pre[0]=nums[0];
        int[] suff=new int[nums.length];
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        // System.out.println();
        for(int j=nums.length-2;j>=0;j--){
            suff[j]=suff[j+1]+nums[j];
        }
        
        for(int i=0;i<nums.length;i++){
            if(pre[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }
}