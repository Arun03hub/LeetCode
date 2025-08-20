class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> result=new ArrayList<>();
       char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueen(board,0,result);
        return result;
    }

    public static void nQueen(char[][] board,int row, List<List<String>> result){
        //base case
        if(row==board.length){
            result.add(constructboard(board));
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board,row+1,result);
                board[row][j]='.';
            }
        }
    }
    public static boolean isSafe(char[][] board,int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static List<String> constructboar]d(char[][] board){
        List<String> list = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            list.add(new String(board[i]));
        }
        return list;
    }
}
