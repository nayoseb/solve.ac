package class3.백준1012유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1 {

    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visit;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static int count;

    public static void main(String[] args) throws IOException {
        //BFS 방법으로 풀기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int c = 0; c < T; c++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N];
            visit = new boolean[M][N];
            count = 0;

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(bufferedReader.readLine(), " ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                cabbage[p1][p2] = 1;

            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (cabbage[i][j] == 1 && !visit[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }


    static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList<int[]>();
        qu.add(new int[]{x, y});

        while (!qu.isEmpty()) {
            x = qu.peek()[0];
            y = qu.peek()[1];
            visit[x][y] = true;
            qu.poll();
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                    if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
                        qu.add(new int[]{cx, cy});
                        visit[cx][cy] = true;
                    }
                }

            }

        }
    }
}
