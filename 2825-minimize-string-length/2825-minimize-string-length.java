class Solution {
    public int minimizedStringLength(String s) {
        Set<Character > sh= new HashSet<>();
        for(char c:s.toCharArray()){
            sh.add(c);
        }
    String str="";
        for(char i :sh){
            str+=i;
        }
        return str.length();
    }
}