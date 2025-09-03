class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
                l1.add(i);

            }

        }
        for(int i:nums){
            if(i==pivot){
                l1.add(i);
            }
        }
        for(int i:nums){
            if(i>pivot){
                l1.add(i);
            }
        }
        int ar[]=new int[l1.size()];
        int d=0;
        for(int i:l1){
        ar[d++]=i;}
        return ar;
        
    }
}