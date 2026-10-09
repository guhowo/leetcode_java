/**
 * leetcode 55. 跳跃游戏
 * https://leetcode.cn/problems/jump-game/description/
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        int k=0;    //当前能够到达的最远下标位置
        for (int i=0; i<nums.length; i++) {
            if (i>k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }

        return true;
    }

}
