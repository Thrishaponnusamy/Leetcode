class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String s= String.valueOf(i);
            if(s.length()%2 !=0){
                continue;
            }
            int s1=0;
              int s2=0;
            int h=s.length()/2;
            for(int k=0;k<h;k++)s1+=s.charAt(k)-'0';
          
            for(int j=h;j<s.length();j++) s2+=s.charAt(j)-'0';
            
            if(s1==s2)
                c++;
            
        }
        return c;
    }
}