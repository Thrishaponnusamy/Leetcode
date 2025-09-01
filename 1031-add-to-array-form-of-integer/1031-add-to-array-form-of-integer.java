class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> kk=new ArrayList<>();
        int yy=num.length-1;
        while(yy>=0 || k>0){
            if(yy>=0){
                k+=num[yy];
                yy--;}
             kk.addFirst(k % 10); 
            k /= 10; 
        }
        return kk;
    }
}