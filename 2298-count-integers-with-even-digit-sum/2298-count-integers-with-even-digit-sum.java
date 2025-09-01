class Solution {
    public int countEven(int num) {
      int c=0;

        for(int i=1;i<=num;i++){
            int m= i;
            int sum=0;
            while(m>0){
                int d=m%10;
                sum=sum+d;
                m=m/10;}
                  if(sum%2==0){
                c++;
                }}
        return c;
    }
}