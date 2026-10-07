/**
 * leetcode 33. 搜索旋转排序数组
 * https://leetcode.cn/problems/search-in-rotated-sorted-array/description/
 */
public class SearchTarget {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int left = 0, right = length-1;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > nums[right]) { //最小、最大都在的在右侧
                left = mid+1;
            } else { //最小、最大都在的在左侧
                right = mid;
            }
        }
        return -1;
    }
}
