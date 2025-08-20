class Solution {
    public void solveSudoku(char[][] board) {
        sudokuAns(board,0,0);
    }
    public static boolean sudokuAns(char[][] board,int row,int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(board[row][col]!='.'){
            return sudokuAns(board,nextrow,nextcol);
        }
        for(char digit='1';digit<='9';digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col] = digit;
                if(sudokuAns(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board,int row,int col,char digit){
        //col
        for(int i=0;i<=8;i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        //row
        for(int i=0;i<=8;i++){
            if(board[row][i]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
}
