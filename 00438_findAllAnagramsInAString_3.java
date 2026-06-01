import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count = new int[26];
        List<Integer> ans = new ArrayList<>();
        
        if (s.length() < p.length()) {
            return ans;
        }

        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i) - 'a']--;
            count[s.charAt(i) - 'a']++;
        }

        int diff = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                diff++;
            }
        }

        if (diff == 0) {
            ans.add(0);
        }

        for (int i = 0; i < s.length() - p.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 0) {
                diff++;
            }else if (count[s.charAt(i) - 'a'] == 1) {
                diff--;
            }
            count[s.charAt(i) - 'a']--;

            if (count[s.charAt(i+p.length()) - 'a'] == 0) {
                diff++;
            }else if (count[s.charAt(i+p.length()) - 'a'] == -1) {
                diff--;
            }
            count[s.charAt(i+p.length()) - 'a']++;

            if (diff == 0) {
                ans.add(i+1);
            }
        }


        return ans;
    }
}