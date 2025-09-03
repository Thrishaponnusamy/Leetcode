class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int max=nums[n-1];
       int secmax=nums[n-2];
       int min=nums[0];
       int secmin=nums[1];
       return (secmax *max)-(secmin*min);
    }
}