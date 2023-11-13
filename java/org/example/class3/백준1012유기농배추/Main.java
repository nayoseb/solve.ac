package class3.백준1012유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 필드 선언: M, N은 각각 배추밭의 가로, 세로 크기. K는 배추의 위치 개수.
    static int M, N, K;
    static int[][] cabbage; // 배추밭을 나타내는 2차원 배열
    static boolean[][] visit; // 방문 여부를 체크하는 2차원 배열
    static int count; // 구역 수를 세는 변수
    // 네 방향 탐색을 위한 배열
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    // DFS 메서드
    static void dfs(int x, int y) {
        visit[x][y] = true; // 현재 노드를 방문했다고 표시

        // 네 방향에 대해서 색
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            // 배추밭 범위 내에 있고, 아직 방문하지 않았으며, 배추가 있는 경우
            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
                    dfs(cx, cy); // 재귀적으로 DFS 수행
                }
            }

        }

    }

    // main 메서드
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력 받음
        StringBuilder stringBuilder = new StringBuilder();


        // 각 테스트 케이스에 대하여
        for (int i = 0; i < T; i++) {
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken()); // 가로 크기
            N = Integer.parseInt(st.nextToken()); // 세로 크기
            cabbage = new int[M][N]; // 배추밭 배열 초기화
            visit = new boolean[M][N]; // 방문 배열 초기화

            K = Integer.parseInt(st.nextToken()); // 배추의 위치 개수
            // 배추 위치 입력 받음
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                cabbage[p1][p2] = 1; // 배추 위치 표시
            }

            // 전체 배추밭 탐색
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    // 아직 방문하지 않은 배추 위치에서 DFS 수행
                    if (cabbage[x][y] == 1 && !visit[x][y]) {
                        dfs(x, y);
                        count++; // 구역 수 증가
                    }
                }
            }

            stringBuilder.append(count + "\n");
        }
        System.out.println(stringBuilder);

    }
}
