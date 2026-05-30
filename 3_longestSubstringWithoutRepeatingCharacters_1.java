import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> alphabet = new HashSet<>();
        int left = 0, right = 0, ans = 0;
        while (right < s.length()) {
            if (!alphabet.contains(s.charAt(right))) {
                alphabet.add(s.charAt(right));
                ans = Math.max(right-left+1, ans);
                right++;
                continue;
            }
            while (s.charAt(left) != s.charAt(right)){
                alphabet.remove(s.charAt(left));
                left++;
            }
            left++;
            right++;
        }

        return ans;
    }
}