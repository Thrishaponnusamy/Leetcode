class Solution {
    public int maxSum(int[] nums) {
    Set<Integer> s=new HashSet<>();
    for(int m:nums){
        s.add(m);
    }
    int sum=0;
    for(int k:s){
        if(k>0){
        sum=sum+k;
    }}
    if(sum==0){
        sum=Collections.max(s);
    }
    return sum;
    }
}