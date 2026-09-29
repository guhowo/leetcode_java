/**
 * 42. 接雨水 https://leetcode.cn/problems/trapping-rain-water
 * 算法复杂度：O(n)，空间复杂度：O(n)
 */
public class Trap {
    public int trap(int[] height) {
        int length = height.length;
        //左侧前缀，记录第i个左侧最高高度(含)
        int[] preMax = new int[length];
        //右侧前缀，记录第i个右侧最高高度(含)
        int[] afterMax = new int[length];
        //计算左右前缀
        int leftMax = height[0];
        for(int i=0; i < length; i++) {
            preMax[i] = Math.max(leftMax, height[i]);
            leftMax = preMax[i];
        }
        int rightMax = height[length-1];
        for(int i=length-1; i >=0; i--) {
            afterMax[i] = Math.max(rightMax, height[i]);
            rightMax = afterMax[i];
        }


        //遍历每个桶，得到每个桶可以乘多少水
        int ans = 0;
        for(int i=1; i<length-1; i++) {
            int h = Math.min(preMax[i], afterMax[i]);
            int water = 0;
            if (h > height[i]) {
                water= h-height[i];
            }
            ans += water;
        }

        return ans;
    }
}
