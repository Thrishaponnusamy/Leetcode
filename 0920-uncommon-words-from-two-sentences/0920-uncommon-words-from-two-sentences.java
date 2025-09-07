import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] m1 = s1.split(" ");
        String[] m2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String mm : m1) {
            map.put(mm, map.getOrDefault(mm, 0) + 1);
        }
        for (String mm : m2) {
            map.put(mm, map.getOrDefault(mm, 0) + 1);
        }

        List<String> l = new ArrayList<>();
        for (String mk : map.keySet()) {
            if (map.get(mk) == 1) {
                l.add(mk);
            }
        }

        return l.toArray(new String[0]);
    }
}
