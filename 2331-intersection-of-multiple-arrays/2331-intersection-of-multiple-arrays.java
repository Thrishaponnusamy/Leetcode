class Solution {
    public List<Integer> intersection(int[][] nums) {
        Set<Integer> mk=new HashSet<>();
        for(int i:nums[0]){
             mk.add(i);
        }
        for(int i=1;i<nums.length;i++){
            Set<Integer> mm=new HashSet<>();
            for(int y:nums[i]){
                if(mk.contains(y)){
                    mm.add(y);
                }
            }
            mk=mm;
        }
     List<Integer> my=new ArrayList<>(mk);
            Collections.sort(my);
        
        return my;
    }
}