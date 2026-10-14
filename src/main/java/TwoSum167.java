/**
 * 167. 两数之和 II - 输入有序数组
 */
public class TwoSum167 {

    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int[] ans = new int[2];
        int left =0, right = n-1;
        while (left<right) {
            if (numbers[left] + numbers[right] == target) {
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }

}
