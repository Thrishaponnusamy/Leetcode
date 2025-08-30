class Solution {
    public int minOperations(int[] nums, int k) {
       Set<Integer> s= new HashSet<>();
       for(int i:nums){
        if(i<k) return -1;
        if(i>k) {
             s.add(i);
            }
       }


return s.size();


    }
}