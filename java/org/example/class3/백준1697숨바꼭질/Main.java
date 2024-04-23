package class3.백준1697숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int[] visited = new int[100001];
        int[] queue = new int[100001];
        int front = 0;
        int rear = 0;

        queue[rear++] = N;
        visited[N] = 1;

        while (front < rear) {
            int now = queue[front++];

            if (now == K) {
                System.out.println(visited[now] - 1);
                break;
            }

            if (now - 1 >= 0 && visited[now - 1] == 0) {
                queue[rear++] = now - 1;
                visited[now - 1] = visited[now] + 1;
            }
            if (now + 1 <= 100000 && visited[now + 1] == 0) {
                queue[rear++] = now + 1;
                visited[now + 1] = visited[now] + 1;
            }
            if (now * 2 <= 100000 && visited[now * 2] == 0) {
                queue[rear++] = now * 2;
                visited[now * 2] = visited[now] + 1;
            }
        }


    }
}
