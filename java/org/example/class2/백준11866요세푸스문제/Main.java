package class2.백준11866요세푸스문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");

        while (que.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int temp = que.poll();
                que.add(temp);
            }
            int num = que.poll();
            stringBuilder.append(num).append(", ");

        }

        int num = que.poll();
        stringBuilder.append(num).append(">");

        System.out.println(stringBuilder);


    }
}
