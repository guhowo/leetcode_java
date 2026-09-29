import java.util.*;

/**
 * leetcode 15. 三数之和 https://leetcode.cn/problems/3sum
 * 思路：采用铆钉一个元素后再用双指针
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        int length = nums.length;

        //1、先排序
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for (int k = 0; k < length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            //去重复
            if (k > 0 && nums[k] == nums[k-1]) {
                continue;
            }
            int twoSum = target - nums[k];
            int l=k+1, r=length-1;
            while (l<r) {
                if (nums[l] + nums[r] > twoSum) {
                    r--;
                } else if (nums[l] + nums[r] < twoSum) {
                    l++;
                } else {
                    List<Integer> array = Arrays.asList(nums[k], nums[l], nums[r]);
                    ans.add(array);
                    l++;
                    r--;
                    while(nums[l] == nums[l-1]) {
                        l++;
                    }
                    while (nums[r] == nums[r+1]) {
                        r--;
                    }
                }
            }
        }

        return ans;
    }
}
