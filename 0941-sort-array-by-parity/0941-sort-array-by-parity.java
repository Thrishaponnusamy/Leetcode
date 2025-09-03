class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int ind=0;
        for(int i:nums){
            if(i%2==0){
                arr[ind++]=i;
            }

        }
        for(int i:nums){
            if(i%2!=0){
                arr[ind++]=i;
            }
        }
        return arr;
            }
}