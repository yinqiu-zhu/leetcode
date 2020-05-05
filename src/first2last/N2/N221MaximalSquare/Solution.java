package first2last.N2.N221MaximalSquare;

import java.util.Arrays;

class Solution {
    int[][] grid;
    char[][] matrix;
    int row, column;
    int ans;

    public int maximalSquare(char[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        this.matrix = matrix;
        row = matrix.length - 1;
        column = matrix[0].length - 1;
        grid = new int[matrix.length][matrix[0].length];
        for (int[] x : grid)
            Arrays.fill(x,-1);
        dp(0, 0);
        return ans * ans;
    }

    private void dp(int r, int c){
        if (grid[r][c] != -1) return ;

        if (r == row && c == column){
            grid[r][c] = matrix[r][c] - '0';
        }
        else if (r == row){
            grid[r][c] = matrix[r][c] - '0';
            dp(r, c+1);
        }
        else if (c == column){
            grid[r][c] = matrix[r][c] - '0';
            dp(r+1, c);
        }
        else {
            dp(r+1,c);
            dp(r,c+1);
            dp(r+1,c+1);
            if (matrix[r][c] == '0') grid[r][c] = 0;
            else grid[r][c] = Math.min(grid[r+1][c],Math.min(grid[r+1][c+1], grid[r][c+1])) +1;
        }

        if (grid[r][c] > ans) ans = grid[r][c];
//        System.out.println("r:"+r+" c:"+ c +" result: " +grid[r][c] );
    }

    public static void main(String[] args) {
        char[][] matr = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        Solution test = new Solution();
        System.out.println(test.maximalSquare(matr));
    }
}
