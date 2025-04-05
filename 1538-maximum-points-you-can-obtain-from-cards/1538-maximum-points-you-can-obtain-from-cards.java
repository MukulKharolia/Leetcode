class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int tsum=0;
        int n=cardPoints.length;
        for(int i=0;i<n;i++){
            tsum+=cardPoints[i];
        }

        int win=n-k;
        int sum=0;
        int max=0;

        for(int i=0;i<n;i++){
            sum+=cardPoints[i];
            if(i>=win){
                sum=sum-cardPoints[i-win];
                max=Math.max(max,tsum-sum);

            }
            else if(i+1==win){
                max=Math.max(max,tsum-sum);
            }
        }
        return max;
    }
}