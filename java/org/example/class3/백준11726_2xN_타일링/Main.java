package class3.백준11726_2xN_타일링;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long[] dp = new long[N+1];

        dp[1] = 1L;
        dp[2] = 2L;

        for (int i = 3; i < N+1; i++) {

            dp[i] = dp[i-1] + dp[i-2];
            if (dp[i]>10007) {
                dp[i] %= 10007;
            }
        }


        System.out.println(dp[N]);
    }
}
