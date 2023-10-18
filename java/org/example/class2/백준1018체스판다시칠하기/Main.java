package class2.백준1018체스판다시칠하기;

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

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int countW = 0; // 'W'로 시작하는 체스판을 기준으로 칠해야 하는 횟수
                int countB = 0; // 'B'로 시작하는 체스판을 기준으로 칠해야 하는 횟수

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {

                        //k행l열
                        if ((k + l) % 2 == 0) {
                            if (arr[k][l] != 'W') countW++;
                            if (arr[k][l] != 'B') countB++;
                        } else {
                            if (arr[k][l] != 'B') countW++;
                            if (arr[k][l] != 'W') countB++;
                        }
                    }
                }
                result = Math.min(result, Math.min(countW, countB));
            }
        }

        System.out.println(result);
    }
}
