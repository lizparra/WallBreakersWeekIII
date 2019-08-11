class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n < 2) return intervals;
        int m = 0; 
        outer : for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (canMerge(intervals, i, j)) {
                    
                    intervals[j][0] = Math.min(intervals[i][0], intervals[j][0]);
                    intervals[j][1] = Math.max(intervals[i][1], intervals[j][1]);
                    intervals[i] = null; 
                    continue outer;
                }
            }
            m++;
        }
        int[][] ans = new int[m][2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (intervals[i] != null) ans[j++] = intervals[i];
        }
        return ans;
    }

    public boolean canMerge(int[][] a, int i, int j) {
        return Math.max(a[i][0], a[j][0]) <= Math.min(a[i][1], a[j][1]);
    }
}
