/**
 * leetcode 153. 寻找旋转排序数组中的最小值
 * https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/description/
 */
public class FindMin {
    public int findMin(int[] nums) {
        int length = nums.length;
        int left = 0, right = length-1;
        while(left < right) {
            int mid = left + (right-left)/2;
            // left>mid>right:impossible
            // left<mid,mid>right:nums发生了旋转，最小值在右侧
            if (nums[mid] > nums[right]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
