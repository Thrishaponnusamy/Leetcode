class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int c=0;
        int dd1=-1;
        int dd2=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
            
             if(dd1==-1){
                dd1=i;}
                else if(dd2==-1){
                    dd2=i;
                }
                else{
                    return false;
                }
        }}
        if(c==0) return true;
        if(c!=2) return false;
        return s1.charAt(dd1)==s2.charAt(dd2)  && s1.charAt(dd2)==s2.charAt(dd1);
    }
}