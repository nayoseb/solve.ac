package class2.백준1929소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        StringBuilder stringBuilder = new StringBuilder();

        int[] arr = new int[N + 1];

        primeNumberSieve(N, arr, stringBuilder, M);

        System.out.println(stringBuilder);
    }

    static void primeNumberSieve(int number, int[] arr, StringBuilder stringBuilder, int min) {
        for (int i = 2; i <= number; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (arr[i] == 0) continue;
            for (int j = i + i; j <= number; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = min; i <= number; i++) {
            if (arr[i] != 0) stringBuilder.append(arr[i] + "\n");
        }
    }

}
