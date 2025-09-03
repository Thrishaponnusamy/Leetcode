class Solution {
    public int sumOfUnique(int[] nums) {
        int mm[]=new int[101];
        for(int k:nums){
            mm[k]++;}
            int sum=0;
            for(int i=1;i<=100;i++){
                if(mm[i]==1){
                    sum=sum+i;
                }

            }
            return sum;
    }

}