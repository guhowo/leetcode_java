/**
 * 53. 最大子序和 https://leetcode.cn/problems/maximum-subarray
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int pre = 0;
        for(int i=0; i<nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            ans = Math.max(pre, ans);
        }

        return ans;
    }
}
