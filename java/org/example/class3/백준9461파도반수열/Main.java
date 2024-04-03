package class3.백준9461파도반수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        long[] dp = new long[101];
        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 4; i < 101; i++) {
            dp[i] = dp[i - 3] + dp[i - 2];
        }

        for (int i = 0; i < T; i++) {
            stringBuilder.append(dp[Integer.parseInt(bufferedReader.readLine())] + "\n");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1));


    }
}