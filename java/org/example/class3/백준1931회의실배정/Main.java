package class3.백준1931회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        }); // 끝나는 시간을 기준으로 정렬

        // 최대한 많은 회의를 배정해야 하므로 끝나는 시간이 빠른 순서대로 정렬
        // 끝나는 시간이 같다면 시작 시간이 빠른 순서대로 정렬
         int count = 0;
        int end = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= end) {
                end = arr[i][1];
                count++;
            }
        }
        System.out.println(count);

    }
}
