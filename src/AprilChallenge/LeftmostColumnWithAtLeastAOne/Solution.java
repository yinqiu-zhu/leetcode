package AprilChallenge.LeftmostColumnWithAtLeastAOne;

import java.util.List;

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> temp = binaryMatrix.dimensions;
        int row= temp.get(0), col = temp.get(1);
        if (row == 0 || col == 0) {
            return -1;
        }
        int curR = 0, curC = col - 1;
        int ans = -1;
        while (curR < row && curC >= 0 ){
            if (binaryMatrix.get(curR,curC) == 0 ){
                curR ++;
            }
            else {
                ans = curC;
                curC --;
                curR = 0;
            }
        }
        return ans;
    }
}
