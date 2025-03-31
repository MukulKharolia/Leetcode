class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int lp=0,rp=height.length-1;
        while(lp<rp){
            int width=rp-lp;
            int min=Math.min(height[lp],height[rp]);
            int currwater=min*width;
            maxwater=Math.max(currwater,maxwater);
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
}