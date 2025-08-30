class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int maxdi=0;
        int maxar=0;
        for(int i=0;i<d.length;i++){
            int l=d[i][0];
            int w=d[i][1];
            int di= (l*l) +( w*w);
             int ar=l*w;
                
       if(di>maxdi){
        maxdi=di;
        maxar=ar;
       }
       else if(di==maxdi){
        maxar=Math.max(maxar,ar);
       }
     
            }
        return maxar;
    }
}