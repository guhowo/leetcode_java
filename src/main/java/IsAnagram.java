import java.util.Objects;

/**
 * 242. 有效的字母异位词 https://leetcode.cn/problems/valid-anagram
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return Objects.equals(s, t);
        }

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int item : count) {
            if (item != 0) {
                return false;
            }
        }

        return true;
    }
}
