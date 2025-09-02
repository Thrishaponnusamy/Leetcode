class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> mn=new HashSet<>();
         String w = word.replaceAll("[^0-9]", " ");
        String[] mm= w.split(" ");
        for(String kk:mm){
            if(!kk.isEmpty()){
                 kk = kk.replaceFirst("^0+", "");
                 if (kk.equals("")) 
                 kk = "0";
                mn.add(kk);
            }

        }
  return mn.size();
    }
}