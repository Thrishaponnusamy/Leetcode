class Solution {
    public int findClosest(int x, int y, int z) {
         int mm = Math.abs(z - x); 
        int nn = Math.abs(y - z);
        if(mm < nn){
            return 1;}

            else if(mm==nn){
                return 0;
            }
            else{
               return 2;
            }
    }
}