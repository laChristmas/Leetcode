import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pattern = new int[26];
        int[] string = new int[26];
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        for (int i = 0; i < p.length(); i++) {
            char alpha = p.charAt(i);
            int index = alpha - 'a';
            pattern[index] = pattern[index] + 1;
        }

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            int index = endChar - 'a';
            string[index] = string[index] + 1;
            
            int start = end - p.length();
            if (start >= 0) {
                char startChar = s.charAt(start);
                int index2 = startChar - 'a';
                string[index2] = string[index2] - 1;
            }

            if (Arrays.equals(string, pattern)) {
                ans.add(start+1);
            }
        }

        return ans;
    }
}
