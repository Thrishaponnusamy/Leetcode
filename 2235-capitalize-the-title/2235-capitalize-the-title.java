class Solution {
    public String capitalizeTitle(String title) {
    String m[]=title.split(" ");
    StringBuilder res=new StringBuilder();
    for(int i=0;i<m.length;i++){
        String w=m[i].toLowerCase();
        if(w.length()>2){
            w=Character.toUpperCase(w.charAt(0))+w.substring(1);
        }
        res.append(w);
    
     if(i<m.length-1){
        res.append(" ");
     }}
       return res.toString(); 
    }
}