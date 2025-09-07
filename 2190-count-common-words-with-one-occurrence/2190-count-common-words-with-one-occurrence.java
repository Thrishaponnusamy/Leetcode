import java.util.*;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        for (String mm : words1) {
            m1.put(mm, m1.getOrDefault(mm, 0) + 1);
        }

        for (String mm : words2) {
            m2.put(mm, m2.getOrDefault(mm, 0) + 1);
        }

        int count = 0;

        for (String word : m1.keySet()) {
            if (m1.get(word) == 1 && m2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}
