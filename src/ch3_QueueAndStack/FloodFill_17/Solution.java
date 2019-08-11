package ch3_QueueAndStack.FloodFill_17;

class Solution {

  int row, column, target, newColor;
  int[][] image;

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

    if (image ==null || image.length == 0) return image;

    this.image = image;
    row = image.length;
    column = image[0].length;
    this.newColor = newColor;

    this.target = image[sr][sc];

    if (target == newColor) return image;

    dfs(sr, sc);

    return image;
  }

  public void dfs(int sr, int sc){
    if (sr >= row || sr < 0 || sc >= column || sc < 0 || image[sr][sc] != target) return;

    image[sr][sc] = newColor;
    dfs(sr,sc + 1);
    dfs(sr,sc - 1);
    dfs(sr+1,sc);
    dfs(sr-1,sc);
  }

  public static void main(String[] args) {

    int[][] test = {{0,0,0},{0,1,1}};
    Solution one = new Solution();
    test = one.floodFill(test,1,1,1);
    for (int[] a : test){
      for (int b : a){
        System.out.print(b);
      }
      System.out.println();
    }
  }
}
