import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 560. 和为 K 的子数组 https://leetcode.cn/problems/subarray-sum-equals-k
 */
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int length = nums.length;
        int[] leftSum = new int[length];

        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        map.put(0, 1);
        int ans = 0;
        for(int i=0; i<length; i++) {
            pre = pre + nums[i];
            if (map.containsKey(pre - k)) {
                ans += map.getOrDefault(pre-k, 0);
            }
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }
        return ans;
    }
}
