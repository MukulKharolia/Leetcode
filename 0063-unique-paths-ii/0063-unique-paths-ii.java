class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // int mod=1000000007;
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] f=new int[m][n];
        return ans(f,m-1,n-1,obstacleGrid);
    }

    public int ans(int[][] f,int m,int n, int[][] arr){
        if(m>=0 && n>=0 && arr[m][n]==1){
            return 0;
        }
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(f[m][n]!=0){
            return f[m][n];
        }
        int up=ans(f,m-1,n,arr);
        int left=ans(f,m,n-1,arr);
        // f[m][n]=up+left;
        return f[m][n]=up+left;
    }
}