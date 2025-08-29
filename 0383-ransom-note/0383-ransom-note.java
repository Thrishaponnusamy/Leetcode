class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      int str[]=new int[26];
      for(char m:magazine.toCharArray()){
        str[m-'a']++;
      }
      for(char m:ransomNote.toCharArray()){
        str[m-'a']--;
        if(str[m-'a']<0){
            return false;
        }
      }
      return true;
    }
}