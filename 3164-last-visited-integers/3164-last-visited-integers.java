class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int c=0;
        for(int i:nums){
            if(i==-1){
              c++;
              if(c<=seen.size()){
                ans.add(seen.get(seen.size()-c));
              }
              else{
                ans.add(-1);
              }

            }
            else{
                seen.add(i);
                c=0;
            }}

return ans;
    }
}