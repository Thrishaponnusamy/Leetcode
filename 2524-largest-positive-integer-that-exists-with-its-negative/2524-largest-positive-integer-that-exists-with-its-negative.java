class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> ss= new HashSet<>();
        for(int i:nums){
            ss.add(i);
        }
        int max=-1;
        for(int yy:nums){
            if(yy>0  && ss.contains(-yy)){
           max=Math.max(max,yy);

            }
        }
        return max;
    }
}