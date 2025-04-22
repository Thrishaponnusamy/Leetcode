class Solution {
    public int countLargestGroup(int n) {
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=0;
            int num=i;
            while(num!=0){
                sum+=num%10;
                num=num/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max=0;
        for(int num:map.values()){
            if(num>max){
                max=num;
            }
        }
        int count=0;
        for(int num:map.values()){
            if(num==max){
                count++;
            }
        }
        return count;
    }
}