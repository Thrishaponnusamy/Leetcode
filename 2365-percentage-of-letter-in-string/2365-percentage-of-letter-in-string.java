class Solution {
    public int percentageLetter(String s, char letter) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(letter==s.charAt(i)){
                c++;
            }
        }
        int ans =c*100/(s.length());
        
        return ans;
    }
}