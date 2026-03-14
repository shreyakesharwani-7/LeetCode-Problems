class Solution {
    static class Edge {
        int i; 
        int j;
        int t;
        public Edge (int i, int j, int t) {
            this.i = i;
            this.j = j;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int time = 0;

        boolean[][] vis = new boolean[n][m];
        Queue<Edge> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Edge(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }

        while(!q.isEmpty()) {

            Edge curr = q.remove();
            int i = curr.i;
            int j = curr.j;
        int t = curr.t;
            time = Math.max(time, t);

            if(i-1 >= 0 && !vis[i-1][j] && grid[i-1][j] == 1) {
                q.add(new Edge(i-1, j, t+1));
                vis[i-1][j] = true;
            }

            if(j+1 < m && !vis[i][j+1] && grid[i][j+1] == 1) {
                q.add(new Edge(i, j+1, t+1));
                vis[i][j+1] = true;
            }

            if(i+1 < n && !vis[i+1][j] && grid[i+1][j] == 1) {
                q.add(new Edge(i+1, j, t+1));
                vis[i+1][j] = true;
            }

            if(j-1 >= 0 && !vis[i][j-1] && grid[i][j-1] == 1) {
                q.add(new Edge(i, j-1, t+1));
                vis[i][j-1] = true;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1 && !vis[i][j]) {
                    return -1;
                }
            }
        }

        return time;
    }
}