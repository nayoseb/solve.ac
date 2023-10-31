package class3.백준17219비밀번호찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        StringBuilder stringBuilder = new StringBuilder();

        HashMap<String,String> hashMap = new HashMap<>();


        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());


        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");

            hashMap.put(stringTokenizer1.nextToken(), stringTokenizer1.nextToken());
        }


        for (int i = 0; i < M; i++) {
            String s = hashMap.get(bufferedReader.readLine());
            stringBuilder.append(s+"\n");
        }

        System.out.println(stringBuilder);

    }
}
