class Solution {
    public String freqAlphabets(String s) {
        StringBuilder mm= new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='#'){
                int n=Integer.parseInt(s.substring(i-2,i));
                mm.append((char)('a' + n-1));
                i-=3;
            }
            else{
                int n=s.charAt(i)-'0';
                mm.append((char)('a'+n-1));
                i--;
            }
            
        }
        return mm.reverse().toString();
    }
}