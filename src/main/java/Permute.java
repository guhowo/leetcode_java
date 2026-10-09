import java.util.ArrayList;
import java.util.List;


/**
 * leetcode 46.全排列
 * https://leetcode.cn/problems/permutations/
 */
public class Permute {

    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<Integer> items = new ArrayList<>();
        backtracking(nums, items, visited);

        return ans;
    }

    private void backtracking(int[] nums, List<Integer> items, boolean[] visited) {
        if (items.size() == nums.length) {
            ans.add(new ArrayList<>(items));
            return;
        }

        for (int i=0; i< nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            items.add(nums[i]);
            visited[i] = true;
            backtracking(nums, items, visited);
            visited[i] = false;
            items.removeLast();
        }

    }
}
