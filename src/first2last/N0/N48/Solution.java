package first2last.N0.N48;

class Solution {
    int len;
    int[][] matrix;
    private int r;
    private int c;
    private int circle;
    public void rotate(int[][] matrix) {
        this.matrix = matrix;
        if (matrix == null || matrix.length == 0) return;

        this.len = matrix.length - 1;
        this.matrix = matrix;

        circle = 1;
        r = 0;
        c = 0;
        while (circle*2 <= len+1){
            System.out.println("pos:" + r + c );
            transfer(r,c);
            getNextPos();
        }

    }

    private void transfer(int r, int c){
        int foreValue = matrix[r][c];
        this.r = r;
        this.c = c;
        for (int i = 0; i < 4; i ++){

            getTransfPos(this.r,this.c);
             int temp = matrix[this.r][this.c];
            matrix[this.r][this.c] = foreValue;
            foreValue = temp;

            System.out.println(this.r+", "+this.c);
            System.out.println(matrix[this.r][this.c]);
        }
    }

    private void getTransfPos(int r, int c){
        this.r = c;
        this.c = len - r;
    }

    private void getNextPos(){
        if (c < len - circle ){
            c ++;
        }
        else {
            r++;
            c = r;
            circle++;
            System.out.println("next:"+circle);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        solution.rotate(a);
    }

}