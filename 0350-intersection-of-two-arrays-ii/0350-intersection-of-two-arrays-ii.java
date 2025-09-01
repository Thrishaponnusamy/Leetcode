class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>  m1= new ArrayList<>();
         List<Integer>  m2= new ArrayList<>();
         List<Integer> mk=new ArrayList<>();
         for(int i:nums1){
            m1.add(i);
         }
           for(int i:nums2){
            m2.add(i);
         }
         for(int i:m1){
            if(m2.contains(i)){
              mk.add(i);
               m2.remove((Integer) i);
            }
         }
         int [] res= new int[mk.size()];
         int ii=0;
         for(int i:mk){
            res[ii++]=i;
         }
        
   return res;
    }
}