给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。

class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        if(m==0){
            return ;
        }
        int n=matrix[0].length;
        boolean rowflag=false;
        boolean colflag=false;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                rowflag=true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                colflag=true;
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                   matrix[i][j]=0;
                }
            }
        }
        if(rowflag){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(colflag){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}