/**
 * leetcode 70. 爬楼梯
 * https://leetcode.cn/problems/climbing-stairs/description/
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        int[] list = new int[n+1];
        list[0] = 1;
        list[1] = 1;
        for (int i=2; i<=n; i++) {
            list[i] = list[i-1]+list[i-2];
        }
        return list[n];
    }


    public int climbStairV2(int n) {
        int a = 1;
        int b = 1;
        int ans = 1;
        for (int i=2; i<=n; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }
        return ans;
    }

}
