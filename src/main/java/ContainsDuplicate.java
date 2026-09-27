import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素 https://leetcode.cn/problems/contains-duplicate
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int item : nums) {
            if(numSet.contains(item)) {
                return true;
            }
            numSet.add(item);
        }

        return false;
    }
}