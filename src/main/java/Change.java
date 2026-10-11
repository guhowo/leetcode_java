import java.util.Arrays;

/**
 * 518. 零钱兑换 II
 */
public class Change {

    public int change(int amount, int[] coins) {
        //dp[i]表示要兑换总价i元时，需要多少硬币
        int[] dp = new int[amount+1];
        dp[0] = 1;

        //求组合数，coins在外层
        for (int c : coins) {
            for (int i=1; i<=amount; i++) {
                if (c <= i) {
                    dp[i] += dp[i - c];
                }
            }
        }
        return dp[amount];
    }
}
