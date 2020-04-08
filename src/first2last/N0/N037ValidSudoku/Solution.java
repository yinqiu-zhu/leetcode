package first2last.N0.N037ValidSudoku;


class Solution {
  public boolean isValidSudoku(char[][] board) {

    boolean[] row = new boolean[9];
    boolean[][] columns = new boolean[9][9];
    boolean[][] boxes = new boolean[9][9];

    for (int i = 0; i < 9 ; i++){

      for (int n = 0; n < 9; n ++){
        row[n] = false;
      }

      for (int j = 0; j < 9; j++){
        if (board[i][j] != '.'){
        int ch =  board[i][j] - '0' - 1;
        int temp = (i / 3 ) * 3  + (j / 3 );
        if (row[ch] || columns[j][ch] || boxes[temp][ch]) return false;
        row[ch] = true;
        columns[j][ch] = true;
        boxes[temp][ch] = true;}
      }
    }
    return true;
  }

  public static void main(String[] args) {
    char[][] temp = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };
    Solution one = new Solution();
    if (
    one.isValidSudoku(temp))
      System.out.println(1);
  }
}
