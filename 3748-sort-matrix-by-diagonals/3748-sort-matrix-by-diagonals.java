class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i - j >= 0) {
                    int r = i;
                    int c = j;
                    List<Integer> m = new ArrayList<>();
                    while (r < n && c < n) {
                        m.add(grid[r][c]);
                        r++;
                        c++;
                    }
                    Collections.sort(m, Collections.reverseOrder());
                    r = i;
                    c = j;
                    int ind = 0;
                    while (r < n && c < n) {
                        grid[r][c] = m.get(ind++);
                        r++;
                        c++;
                    }
                } else {
                    int r = i;
                    int c = j;
                    List<Integer> l = new ArrayList<>();
                    while (r < n && c < n) {
                        l.add(grid[r][c]);
                        r++;
                        c++;
                    }
                    Collections.sort(l);
                    r = i;
                    c = j;
                    int vl = 0;
                    while (r < n && c < n) {
                        grid[r][c] = l.get(vl++);
                        r++;
                        c++;
                    }
                }
            }
        }
        return grid;
    }
}
