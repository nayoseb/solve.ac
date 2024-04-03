package class3.백준9375패션왕신혜빈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());

            HashMap<String, Integer> hashMap = new HashMap<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

                String 의상이름 = stringTokenizer.nextToken();
                String 의상종류 = stringTokenizer.nextToken();

                if (hashMap.containsKey(의상종류)) {
                    hashMap.put(의상종류, hashMap.get(의상종류) + 1);
                } else
                    hashMap.put(의상종류, 1);

            }
            int result = 1;
            //hashmap을 순회하면서 결과값에 곱
            for (int val : hashMap.values()) {
                result *= (val + 1);
            }
            //알몸인 상태 제외
            stringBuilder.append(result - 1 + "\n");
        }
        System.out.println(stringBuilder);
    }
}
