/**
 * 11. 盛最多水的容器 https://leetcode.cn/problems/container-with-most-water
 * 算法复杂度：O(n) 空间复杂度：O(1)
 */

public class MaxArea {
    public int maxArea(int[] height) {
        int ans = 0;
        int length = height.length;
        int left = 0, right = length-1;
        while(left < right) {
            int tmp = (right-left)*Math.min(height[right], height[left]);
            ans = Math.max(tmp, ans);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}
