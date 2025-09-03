class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int []n=new int[10001];
        // for(int i:nums){
        //     n[i]++;
        // }
        // for(int i=1;i<10001;i++){
        //     if(n[i]==1){
        //         return i;
        //     }


        // }
        // return 0;
        int ans=0;
        for(int i:nums){
            ans^=i;
        }
        return ans;
    }
}