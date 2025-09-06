class Solution {
    public String decodeString(String s) {
        List<Integer > mm=new ArrayList<>();
        List<StringBuilder > mn=new ArrayList<>();
        StringBuilder km=new StringBuilder ();
        int k=0;
        for( char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10 + (ch-'0');

            }
            else if(ch=='['){
                mm.add(k);
                mn.add(km);
                k=0;
                km=new StringBuilder();
            }
            else if(ch ==']'){
                  int c=mm.remove(mm.size()-1);
                  StringBuilder yy=mn.remove(mn.size()-1);
            
            for(int i=0;i<c;i++){
                yy.append(km);
            }
             km=yy;}
            else{
                km.append(ch);
            }
           
        }

return km.toString();
        
    }
}