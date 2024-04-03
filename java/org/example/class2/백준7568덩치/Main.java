package class2.백준7568덩치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            result[i] = rank;
        }


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N - 1; i++) {
            stringBuilder.append(result[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.append(result[N - 1]);

        System.out.println(stringBuilder);


    }


}
