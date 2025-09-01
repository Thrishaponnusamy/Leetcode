class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String m= countAndSay(n - 1); 
        StringBuilder mk= new StringBuilder();
        int c=1;
        for(int i=0;i<m.length();i++){
            if(i<m.length()-1 && m.charAt(i)==m.charAt(i+1)){
                c++;}
                else{
            mk.append(c);
            mk.append(m.charAt(i));
            c=1;
            }
        }
        String y=mk.toString();
        return y;
    }
}