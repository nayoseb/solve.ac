package class3.백준11724연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        //백준 11724 연결요소의 개수
        int[][] arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        boolean[] visit = new boolean[N + 1];
        int answer = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visit[i]) {
                dfs(i, arr, visit);
                answer++;
            }
        }
        System.out.println(answer);

    }
    //dfs 탐색
    public static void dfs(int num, int[][] arr, boolean[] visit) {
        visit[num] = true;
        for (int i = 1; i < arr.length; i++) {
            if (!visit[i] && arr[num][i] == 1) {
                dfs(i, arr, visit);
            }
        }
    }
}
