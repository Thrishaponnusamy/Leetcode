class Solution {
    public int maximumCount(int[] nums) {
        int c=0;
        int n=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
        if(nums[i]>0){
            c++;

        }
        if(nums[i]<0){
            n++;
        }
    }}
return Math.max(c,n);
    }
}