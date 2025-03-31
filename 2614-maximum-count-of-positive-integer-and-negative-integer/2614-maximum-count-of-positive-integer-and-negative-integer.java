class Solution {
    public int maximumCount(int[] nums) {
        int nev=0;
        int pev=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pev++;
            }
            else if(nums[i]<0){
                nev++;
            }
        }
        return nev>pev ? nev:pev;
    }
}