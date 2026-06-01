import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs){
            char[] charArray = str.toCharArray();
            java.util.Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramMap.containsKey(sortedStr)){
                anagramMap.put(sortedStr, new java.util.ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }

        return new java.util.ArrayList<>(anagramMap.values());
    }
}
