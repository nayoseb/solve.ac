package class3.백준1389케빈베이컨의6단계법칙;

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

        int[][] arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        // 플로이드-워셜 알고리즘
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == j) continue;
                    if (arr[i][k] != 0 && arr[k][j] != 0) {
                        if (arr[i][j] == 0) {
                            arr[i][j] = arr[i][k] + arr[k][j];
                        } else {
                            arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                        }
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                sum += arr[i][j];
            }
            if (min > sum) {
                min = sum;
                result = i;
            }
        }
        System.out.println(result);
    }
}