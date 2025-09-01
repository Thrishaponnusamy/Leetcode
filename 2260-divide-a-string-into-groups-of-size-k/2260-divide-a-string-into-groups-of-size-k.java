class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> y=new ArrayList<>();
         
        for (int i = 0; i < s.length(); i += k){

           String m = s.substring(i, Math.min(i+k, s.length()));


                while(m.length()<k){
                    m+=fill;
                }
            
      y.add(m);
        }
      String[] kk=new String[y.size()];
      return y.toArray(kk);
    }
}