class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        // int[] ans=new int[2];

        int st=0;
        int en=n-1;
        

        while(st<=en){
            int mid=st-(st-en)/2;
            int mEle=0;
            for(int i=0;i<m;i++){
                if(mat[mEle][mid]<=mat[i][mid]){
                    mEle=i;
                }
            }

            boolean lBig=mid-1>=st && mat[mEle][mid]<mat[mEle][mid-1];
            boolean rBig=mid+1<=en && mat[mEle][mid]<mat[mEle][mid+1];

            if(!lBig && !rBig){
                return new int[]{mEle,mid};
            }
            else if(rBig){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
            
        }
        return new int[]{-1, -1};
    }
}