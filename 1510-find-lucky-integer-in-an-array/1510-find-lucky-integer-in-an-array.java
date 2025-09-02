class Solution {
    public int findLucky(int[] arr) {
        int []a1=new int [501];
        for(int i=0;i<arr.length;i++){
            a1[arr[i]]++;
        }
        int m=-1;
        for(int i=1;i<=500;i++){
            if(i==a1[i]){
                m=i;
            }
        }
        return m;
    }
}