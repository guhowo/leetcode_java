import java.util.Deque;
import java.util.LinkedList;

/**
 * 739. 每日温度
 * https://leetcode.cn/problems/daily-temperatures/description/
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        //用于存储递减栈的元素下标
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int top = stack.pop();
                ans[top] = i - top;
            }
            stack.push(i);
        }

        return ans;
    }
}
