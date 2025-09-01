class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> m=new ArrayList<>();
        List<Integer> mm=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                m.add(i);
            }}
            boolean mk[]=new boolean[nums.length];
            for(int kk:m){
                int s=Math.max(0,kk-k);
                int e=Math.min(nums.length-1,kk+k);
                for(int i=s;i<=e;i++){
                   
                        mk[i]=true;
                    
                    
                }}
                   for (int i = 0; i < nums.length; i++) {
            if (mk[i]) {
                mm.add(i);
            }
        }

                
            

return mm;
    }
}