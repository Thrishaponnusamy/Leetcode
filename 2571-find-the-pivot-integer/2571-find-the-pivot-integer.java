class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        for(int i=0;i<=n;i++){
            int l= (i*(i+1))/2;
            int r=total-(i*(i-1))/2;
            if(r==l){
                return i;
            }
        }
        return -1;
    }
}