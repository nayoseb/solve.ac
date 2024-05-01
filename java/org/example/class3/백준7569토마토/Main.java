package class3.백준7569토마토;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int H = Integer.parseInt(stringTokenizer.nextToken());

        // 3차원 배열로 토마토 상자를 생성합니다.
        int[][][] arr = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                String[] input = bufferedReader.readLine().split(" ");
                for (int k = 0; k < M; k++) {
                    arr[i][j][k] = Integer.parseInt(input[k]);
                }
            }
        }

        // 상하좌우위아래를 나타내는 배열입니다.
        int[] dx = {0, 0, 1, -1, 0, 0};
        int[] dy = {1, -1, 0, 0, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        Queue<Tomato> queue = new LinkedList<>();
        int maxDay = 0;

        // 이미 익은 토마토를 큐에 추가합니다.
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (arr[i][j][k] == 1) {
                        queue.add(new Tomato(i, j, k, 0));
                    }
                }
            }
        }

        // BFS를 수행하여 모든 토마토를 익힙니다.
        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            maxDay = Math.max(maxDay, tomato.day);

            for (int i = 0; i < 6; i++) {
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];
                int nz = tomato.z + dz[i];

                if (nx >= 0 && nx < H && ny >= 0 && ny < N && nz >= 0 && nz < M && arr[nx][ny][nz] == 0) {
                    arr[nx][ny][nz] = 1;
                    queue.add(new Tomato(nx, ny, nz, tomato.day + 1));
                }
            }
        }

        // 아직 익지 않은 토마토가 있는지 확인합니다.
        for (int[][] layer : arr) {
            for (int[] row : layer) {
                for (int cell : row) {
                    if (cell == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        // 모든 토마토가 익는데 걸린 시간을 출력합니다.
        System.out.println(maxDay);
    }

    // 토마토의 위치와 익는데 걸린 시간을 저장하는 클래스입니다.
    static class Tomato {
        int x, y, z, day;

        Tomato(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }
}