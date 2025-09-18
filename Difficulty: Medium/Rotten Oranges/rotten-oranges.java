import java.util.*;

class Solution {
    public int orangesRotting(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // collect all initially rotten oranges and count fresh ones
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    q.offer(new int[]{i, j, 0}); // {row, col, time}
                } else if (mat[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], t = cur[2];
            minutes = Math.max(minutes, t);

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && mat[nr][nc] == 1) {
                    mat[nr][nc] = 2;   // rot it
                    fresh--;
                    q.offer(new int[]{nr, nc, t + 1});
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}
