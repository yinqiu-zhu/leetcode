package first2last.N0.N011ContainerWithMostWater;

class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int start = 0, end = height.length-1;
        int ans = 0;
        while (start < end){
            int min = Math.min(height[start], height[end]);
            ans = Math.max(ans, min* (end - start));
            if (min == height[start]) start ++;
            else end --;
        }
        return ans;
    }
}
