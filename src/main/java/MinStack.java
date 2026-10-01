import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * leetcode 155. 最小栈 https://leetcode.cn/problems/min-stack/description/
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * 实现 MinStack 类:
 *
 * MinStack() 初始化堆栈对象。
 * void push(int value) 将元素 value 推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 */
public class MinStack {

    List<Integer> stack;
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
        priorityQueue.add(value);
    }

    public void pop() {
        int a = stack.getLast();
        stack.removeLast();
        priorityQueue.remove(a);
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return priorityQueue.peek();
    }
}
