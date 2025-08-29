class Solution {
    public boolean isValid(String word) {
        int u = 0;
        int l = 0;
        int d = 0;
        int v = 0;
        int c = 0;
        int mc = 0;

        if (word.length() < 3) return false;

        for (char m : word.toCharArray()) {
            if (Character.isUpperCase(m)) {
                u++;
                if ("AEIOU".indexOf(m) >= 0) v++;
                else c++;
            } else if (Character.isLowerCase(m)) {
                l++;
                if ("aeiou".indexOf(m) >= 0) v++;
                else c++;
            } else if (Character.isDigit(m)) {
                d++;
            } else {
                return false;
            }
        }

        return (v > 0 && c > 0);
    }
}
