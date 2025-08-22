class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // List<Integer> a= new ArrayList<>();
        //  List<Integer> b= new ArrayList<>();
        //  int c=0;int y=0;
        //  Collections.sort(a);
        //  Collections.sort(b);
        //   for(int j:arr){
        //     b.add(j);}
        //      for(int i:target){
        //     a.add(i);}
        //  for(int i:target){
        //     if(b.contains(i)){
        //         c++;
        //     }
        //  }
        //  for(int j:arr){
            
        //     if(a.contains(j)){
        //         y++;
        //     }
        //  }
        
        // if(c!=1 && y!=1){

        //     return false;}
        //     return true;
        
        Arrays.sort(target);
        Arrays.sort(arr);

        if(Arrays.equals(target,arr)){
            return true;
        }
        return false;

        
        
        
        
        }
}