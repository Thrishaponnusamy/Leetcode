class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int nums[]=arr.clone();
       Arrays.sort(nums);
    Map <Integer,Integer> map =new LinkedHashMap<>();
       int count=1;
       for(int i:nums){
        if(!map.containsKey(i)){
            map.put(i,count++);
        }}
        for(int i=0;i<arr.length;i++){
            nums[i]=map.get(arr[i]);
        }
       
       return nums;
    }
}