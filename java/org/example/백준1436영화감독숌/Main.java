package 백준1436영화감독숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        int result = 666;

        int N = Integer.parseInt(bufferedReader.readLine());

        while (num!=N) {
            result++;
            if (String.valueOf(result).contains("666")) {
                num++;
            }
        }

        System.out.println(result);
    }
}
