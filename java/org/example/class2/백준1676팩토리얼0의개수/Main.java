package 백준1676팩토리얼0의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
//        BigInteger num = BigInteger.ONE;
//        for (int i = 1; i <= N; i++) {
//            num = num.multiply(BigInteger.valueOf(i));
//        }
//        char[] arr = num.toString().toC           harArray();
//        check(arr);
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int temp = i;
            while ((temp % 5) == 0 && temp > 0) {
                temp /= 5;
                count++;
            }
        }
        System.out.println(count);
    }

//    private static void check(char[] arr) {
//        int count = 0;
//        int num = arr.length-1;
//        while (num>=0) {
//            if (arr[num]=='0') {
//                count++;
//                num--;
//            } else break;
//        }
//        System.out.println(count);
//    }
}
