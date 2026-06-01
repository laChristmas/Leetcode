import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> pattern = new HashMap<>();
        Map<Character,Integer> string = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            char alpha = p.charAt(i);
            if (pattern.containsKey(alpha)) {
                int val = pattern.get(alpha);
                pattern.replace(alpha, val+1);
            }else {
                pattern.put(alpha, 1);
            }
        }

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            if (string.containsKey(endChar)) {
                int val = string.get(endChar);
                string.replace(endChar, val+1);
            }else {
                string.put(endChar, 1);
            }
            
            int start = end - p.length();
            if (start >= 0) {
                char startChar = s.charAt(start);
                int val = string.get(startChar);
                if (val > 1) {
                    string.replace(startChar, val-1);
                }else {
                    string.remove(startChar);
                }
            }

            if (string.equals(pattern)) {
                ans.add(start+1);
            }
        }

        return ans;
    }
}
