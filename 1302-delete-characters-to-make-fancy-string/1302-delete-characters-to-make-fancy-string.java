class Solution {
    public String makeFancyString(String s) {
        StringBuilder m=new StringBuilder();
        int c=0;
        char p=' ';
        for(int i=0;i<s.length();i++){
            char cr=s.charAt(i);
            if(cr==p){
                c++;
            }
            else{
                c=1;
                p=cr;
            }
        
        if(c<=2){
            m.append(cr);
        }}
        return m.toString();
    }
}