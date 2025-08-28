class Solution {
    public int countSegments(String s) {
        String m[]=s.split(" ");
        int c=0;
        for(String k:m){
            if(!k.isEmpty()){
                c++;
            }
        }
        return c;
    }
}