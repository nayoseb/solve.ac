package 백준15829Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int M = 1234567891;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(bufferedReader.readLine());
        String str_L = bufferedReader.readLine();
        long sum = 0;
        long pow = 1;
        char[] arr = str_L.toCharArray();
        for (int i = 0; i < L; i++) {
            sum += (arr[i] - 'a' + 1) * pow % M; //분배법칙
            pow = pow * 31 % M; //분배법칙
        }
        long hash = sum % M;
        System.out.println(hash);


    }
}
