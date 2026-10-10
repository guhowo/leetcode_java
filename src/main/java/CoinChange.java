import java.util.Arrays;

/**
 * 322. 零钱兑换
 * https://leetcode.cn/problems/coin-change/description/
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        // dp[i] 表示要兑换i元时最少硬币个数
        int[] dp = new int[amount+1];

        // 用 amount+1 作为"不可能达到"的哨兵值：加 1 也不会溢出，
        // 且最后可用 dp[amount] > amount 判断无解
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i=1; i<=amount; i++) {
            for (int c : coins) {
                // 枚举"最后一枚"硬币面额 c：dp[i] = min(dp[i-c] + 1)
                if (c<=i) {
                    dp[i] = Math.min(dp[i-c]+1, dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
