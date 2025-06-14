class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> comb=new ArrayList<>();
        // List<String> arr=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i],'.');
        }
        place(board,0,comb);
        return comb;
    }

    public boolean isSafe(char[][] board,int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')
            return false;
        }
        //diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')
            return false;
        }
        //diagnol right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }

    public void place(char[][] board,int row,List<List<String>> comb){
        if(row==board.length){
            string(board,comb);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                place(board,row+1,comb);
                board[row][j]='.';
            }
        }
    }

    public void string(char[][] board,List<List<String>> comb){
        List<String> arr=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<board[0].length;j++){
                sb.append(board[i][j]);
            }
            arr.add(sb.toString());
        }
        comb.add(new ArrayList<>(arr));
    }


}