package first2last.N0.N073SetMatrixZeroes;

class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix==null || matrix.length == 0 || matrix[0].length == 0)
            return;

        int row = matrix.length;
        int col = matrix[0].length;
        boolean zeroTop = matrix[0][0] == 0, zeroRight = zeroTop;
        int r = 1, c = 1;
        while (!zeroRight && r < row){
            if (matrix[r][0] == 0) zeroRight = true;
            r ++;
        }
        while (!zeroTop && c < col){
            if (matrix[0][c] == 0) zeroTop = true;
            c++;
        }

        for (int i = 1; i < row; i++){
            for (int j = 1; j < col; j++){
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = row - 1; i > 0; i--){
                if (matrix[i][0] == 0) {
                    for (int j = 1; j < matrix[0].length; j++)
                        matrix[i][j] = 0;
                }
        }

        for (int j =  col-1; j > 0; j--){
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++)
                    matrix[i][j] = 0;
            }
        }

        if (zeroRight){
            for ( int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }
        if (zeroTop){
            for ( int i = 0; i < col; i++){
                matrix[0][i] = 0;
            }
        }

    }
}
