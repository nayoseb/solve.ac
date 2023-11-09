package class3.백준1_2_3더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        int[] dp = new int[11];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();


        dp[1] = 1; //초기 값 초기화
        dp[2] = 2;
        dp[3] = 4;

        for (int j = 4; j <= 10; j++) { // 4부터 반복
            dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1]; // 점화식
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(dp[n] + "\n");

        }

        System.out.println(stringBuilder);


    }


}

