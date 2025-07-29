class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] f=new int[m][n];
        f[0][0]=grid[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    continue;
                }
                else if(i>=0 && j>=0){
                    if(i-1<0){
                        f[i][j]=grid[i][j]+f[i][j-1];
                    }
                    if(j-1<0){
                        f[i][j]=grid[i][j]+f[i-1][j];
                    }
                    if(i-1>=0 && j-1>=0){
                        int up=f[i-1][j];
                        int left=f[i][j-1];
                        f[i][j]=Math.min(up+grid[i][j],left+grid[i][j]);
                    }
                }
            }
        }
        return f[m-1][n-1];
    }
}