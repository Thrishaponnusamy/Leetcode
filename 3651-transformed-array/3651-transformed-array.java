class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        for(int i=0;i<nums.length;i++){
               int ar=((i+nums[i]%n+n)%n);
               arr[i]=nums[ar];
        }
        return arr;
    }
}