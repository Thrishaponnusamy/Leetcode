class Solution {
    public List<String> cellsInRange(String s) {
        char[] m = s.toCharArray();
        List<String> mm = new ArrayList<>();
        for(char i=m[0];i<= m[3];i++){
            for(char j=m[1];j<= m[4];j++){
                 mm.add("" + i + j ) ;
            }
        }
        return mm;
    }
}