package Question3;


import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            if(set.size() > max) {
                max = set.size();
            }
            right++;
        }
        return max;
    }

}
