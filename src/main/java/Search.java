/**
 * leetcode 704. 二分查找
 * https://leetcode.cn/problems/binary-search/description/
 */
public class Search {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int left = 0, right = length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
