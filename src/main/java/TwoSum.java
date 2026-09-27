import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和 https://leetcode.cn/problems/two-sum
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // key是数字，value是数字在数组中的下标
        Map<Integer, Integer> map = new HashMap<>();

        for (int i =0; i<nums.length; i++) {
            int delta = target - nums[i];
            Integer j = map.get(delta);
            if (j != null) {
                return new int[] {j, i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}
