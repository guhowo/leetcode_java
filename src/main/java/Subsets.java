import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 78.子集
 * https://leetcode.cn/problems/subsets/description/
 */
public class Subsets {

    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> items = new ArrayList<>();
        backtracking(nums, 0, items);
        return ans;
    }

    private void backtracking(int[] nums, int start, List<Integer> items) {
        ans.add(new ArrayList<>(items)); //每个单独的元素都是子集

        for (int i=0; i<nums.length; i++) {
            items.add(nums[i]);
            backtracking(nums, i+1, items);
            items.removeLast();
        }
    }
}
