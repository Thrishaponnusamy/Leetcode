class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character > ss= new HashSet<>();
    int r=0;
    int l=0;
    int m=0;
    while(r<s.length()){
          char ch=s.charAt(r);
          if(!ss.contains(ch)){
            ss.add(ch);
            m=Math.max(m,r-l+1);
            r++;
          }
          else{
            char ch1=s.charAt(l);
            if(ss.contains(ch1)){
                ss.remove(ch1);
                l++;
            }
          }

    }
        return m;
        
    }
}