/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
        //top
        for(int j=startcol;j<=endcol;j++){
            result.add(matrix[startrow][j]);
        }
        //rigth
        for(int i=startrow+1;i<=endrow;i++){
            result.add(matrix[i][endcol]);
        }
        //bottom
        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
            result.add(matrix[endrow][j]);
        }
        //left
        for(int i=endrow-1;i>startrow;i--){
            if(startcol==endcol){
                break;
            }
            result.add(matrix[i][startcol]);
        }
        startrow++;
        startcol++;
        endrow--;
        endcol--;
        }
        return result;
    }
}
