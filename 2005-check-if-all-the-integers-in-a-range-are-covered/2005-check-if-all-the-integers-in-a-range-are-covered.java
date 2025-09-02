class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        for(int i=left;i<=right;i++){
            boolean c=false;
            for(int j=0;j<ranges.length;j++){
                     if (i >= ranges[j][0] && i <= ranges[j][1]) {
                    c= true;
                    break;
                   }
            }
            if(!c) return false;
        }
        return true;
    }
}