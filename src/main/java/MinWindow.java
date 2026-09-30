import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * leetcode 76. 最小覆盖子串
 * https://leetcode.cn/problems/minimum-window-substring/description/
 */
public class MinWindow {

    public String minWindow(String s, String t) {
        String ans = "";
        int m = s.length();
        int n = t.length();

        // 用于记录t中每个字符常出现的个数
        Map<Character, Integer> need = new HashMap<>();
        for (int i=0; i< n; i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0)+1);
        }

        // 滑动窗口的双指针
        int l = 0, r = 0;
        Map<Character, Integer> window = new HashMap<>();
        int have = 0; //substring中有多少个字符满足了t中的字符
        while (r < m) {
            char c = s.charAt(r);
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c,0)+1);

                // 当前字符数量刚好达到要求
                if (Objects.equals(window.get(c), need.get(c))) {
                    have++;
                }
            }

            //满足要求后，缩小窗口
            while(have == need.size()) {
                if (r - l < ans.length() || ans.isBlank()) {
                    ans = s.substring(l, r);
                }
                // 准备移除 left
                char d = s.charAt(l);
                l++;
                if (need.containsKey(d)) {
                    window.put(d, window.get(d)-1);
                    if (window.get(d) < need.get(d)) {
                        have--;
                    }
                }
            }
        }

        return ans;

    }
}
