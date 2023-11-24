package class3.벡즌1927최소힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int x;
        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(bufferedReader.readLine());
            if (!(x == 0)) {
                queue.add(x);
            } else if (!queue.isEmpty()) {
                stringBuilder.append(queue.poll() + "\n");
            } else {
                stringBuilder.append(0 + "\n");
            }

        }

        System.out.println(stringBuilder);

    }
}
