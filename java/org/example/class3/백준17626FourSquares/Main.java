package class3.백준17626FourSquares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());


        int[] dp = new int[n + 1];

        //제곱이면 dp[i] = 1
        //ex) 1^2 2^@2 3^2 4^2
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            //i의 제곱근보다 작을 때까지
            for (int j = 1; j * j <= i; j++) {
                int tmp = i - (j * j);
                min = Math.min(min, dp[tmp]);
            }
            dp[i] = min + 1;
        }
        System.out.println(dp[n]);
    }

}
