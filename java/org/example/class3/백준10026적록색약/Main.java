package class3.백준10026적록색약;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bufferedReader.readLine());
        arr = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = bufferedReader.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        int normal = 0;
        int colorBlind = 0;

        // Normal
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, arr[i][j]);
                    normal++;
                }
            }
        }

        visited = new boolean[N][N]; // Reset visited array

        // Color Blind
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfsColorBlind(i, j, arr[i][j]);
                    colorBlind++;
                }
            }
        }

        System.out.println(normal + " " + colorBlind);
    }

    public static void dfs(int x, int y, char color) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && arr[nx][ny] == color) {
                    dfs(nx, ny, color);
                }
            }
        }
    }

    public static void dfsColorBlind(int x, int y, char color) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && (color == 'B' ? arr[nx][ny] == 'B' : arr[nx][ny] != 'B')) {
                    dfsColorBlind(nx, ny, color);
                }
            }
        }
    }
}