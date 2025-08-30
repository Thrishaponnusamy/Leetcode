class Solution {
    public String largestGoodInteger(String num) {
        String m= "";
        for(int i=0;i<=num.length()-3;i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i)== num.charAt(i+2)){
                String k=num.substring(i,i+3);
                if(k.compareTo(m)>0){
                    m=k;
                }
            }
            }
            return m;
        
    }
}