class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
       
        int up=0;
        
        for(int i=0;i < fruits.length;i++){
            boolean p= false;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    p=true;
                    break;
                }}
                if(!p){
                    up++;
                }
            
        }
        return up;
    }
}