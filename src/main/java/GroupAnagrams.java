import java.util.*;

/**
 * 49. 字母异位词分组 https://leetcode.cn/problems/group-anagrams
 */
public class GroupAnagrams {

    //方法一
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        List<List<String>> ans = new ArrayList();
        for(String key : map.keySet()) {
            List<String> value = map.get(key);
            ans.add(value);
        }

        return ans;
    }

    //方法二
    public List<List<String>> groupAnagramsV2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //计算字母出现次数
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            System.out.println(key);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        return new ArrayList<>(map.values());
    }
}
