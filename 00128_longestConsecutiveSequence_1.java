import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int key : set) {
            if (!set.contains(key - 1)) {
                int current = 1;
                while (set.contains(key + 1)) {
                    key++;
                    current++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }
}


