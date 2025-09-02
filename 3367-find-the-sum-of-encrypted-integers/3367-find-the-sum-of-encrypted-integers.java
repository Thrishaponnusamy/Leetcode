class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int tt=0;
        for(int i:nums){
            int md=0;
            int d=0;
            int t=i;
            while(t>0){
                md=Math.max(md,t%10);
                d++;
                t/=10;
            }
            int e=0;
            for(int k=0;k<d;k++){
               e=e*10+md;
            }
            tt+=e;
        }
        return tt;
    }
}