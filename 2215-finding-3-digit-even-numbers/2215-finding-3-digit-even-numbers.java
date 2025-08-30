import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> s = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) continue;  // must be different indices

                    int a = digits[i], b = digits[j], c = digits[k];

                    if (a == 0) continue;      // no leading zero
                    if (c % 2 != 0) continue; // last digit must be even

                    int num = a * 100 + b * 10 + c;
                    s.add(num);
                }
            }
        }

     
        int[] ans = s.stream().sorted().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
