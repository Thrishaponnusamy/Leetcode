class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum=sum+apple[i];}
         int c=0;
         int s=0;
        for(int i=capacity.length-1;i>=0;i--){
            s=s+capacity[i];
            if(!(s>=sum)){
                c++;
            }

        }

 return c+1;
    }
}