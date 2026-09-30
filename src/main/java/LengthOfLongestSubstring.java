import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 3. 无重复字符的最长子串
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }
        int ans = 0;
        int left = 0, right = 0;
        // key=nums[j], value=index
        Map<Character, Integer> mp = new HashMap<>();
        while(right < s.length()) {
            if (mp.containsKey(s.charAt(right))) {
                left = Math.max(left, mp.get(s.charAt(right)) + 1);
            }
            mp.put(s.charAt(right), right);
            ans = Math.max(right-left+1, ans);
            right++;
        }

        return ans;
    }
}
