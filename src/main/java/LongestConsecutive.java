import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for(int num : set) {
            if (set.contains(num-1)) {
                continue;
            }
            int currentLongest = 1;
            int currentNum = num;
            while(set.contains(currentNum+1)) {
                currentNum++;
                currentLongest++;
                longest = Math.max(currentNum, currentLongest);
            }
        }

        return longest;

    }
}
