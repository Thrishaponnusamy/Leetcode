class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        List<Integer> points = new ArrayList<>();

        for (List<Integer> car : nums) {
            int start = car.get(0);
            int end = car.get(1);
           for(int i=start;i<=end;i++){
            if(!points.contains(i)){
                points.add(i);
            }
           }
        }
return points.size();

        }}
