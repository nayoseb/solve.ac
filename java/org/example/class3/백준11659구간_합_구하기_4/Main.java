package class3.백준11659구간_합_구하기_4;

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
        StringBuilder stringBuilder = new StringBuilder();


        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            arr[i] = Integer.parseInt(stringTokenizer1.nextToken());
        }


        int[] dp = new int[100001];
        dp[1] = arr[1];



        for (int i = 2; i < N+1; i++) {
            dp[i] = dp[i-1] + arr[i];
        }


        for (int i = 0; i < M; i++) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine(), " ");
            int start = Integer.parseInt(stringTokenizer2.nextToken());
            int end = Integer.parseInt(stringTokenizer2.nextToken());

            stringBuilder.append(dp[end]-dp[start-1] + "\n");
        }
        System.out.println(stringBuilder);


    }
}
