class Solution {
    public int maxNumberOfBalloons(String text) {
        int [] ff=new int[26];
        for(char ch:text.toCharArray()){
            ff[ch- 'a']++;
        }
        int b= ff['b'-'a'];
         int a= ff['a'-'a'];
         int l= ff['l'-'a']/2;
          int o= ff['o'-'a']/2;
           int n=ff['n'-'a'];
           return Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);

    }
}