class Solution {
    public int minimumOperations(int[] nums) {
        int s=0;
        int n=nums.length;
        int o=0;
        while(true){
        boolean d=true;
        for(int i=s;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                     d=false;
                     break;
                }}
                if(!d) break;
        }
                if(d) break;
                    s+=3;
                    o++;
                
            
            if (s >= n) break;
        }
  return o;
    }
}