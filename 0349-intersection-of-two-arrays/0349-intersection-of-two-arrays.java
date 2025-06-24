class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1=new HashSet<>();
       Set <Integer > set2=new HashSet<>();
       for(int i:nums1){
        set1.add(i);
       }
       for(int j:nums2){
        if(set1.contains(j)){
                set2.add(j);
        }}
         int []arr=new int[set2.size()];
        int index=0;
        for(int n :set2){
            arr[index++]=n; }
return arr;
       
       
       
    }
       
       
       
           
}