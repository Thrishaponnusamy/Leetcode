class Solution {
    public int reverseDegree(String s) {
        int length=s.length();
        int sum=0;
        for(int  i=0;i<s.length();i++){
            int m=26-(s.charAt(i)-'a');
            sum=sum+(m*(i+1));
        }
        return sum;
    }
}