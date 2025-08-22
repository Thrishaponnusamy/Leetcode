class Solution {
    public boolean findSubarrays(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]+nums[i+1]==nums[j]+nums[j+1]){
                    c++;
                }
            }
        }
        return c>=1;
    }
}