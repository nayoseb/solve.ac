package class2.백준2154카드2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < N + 1; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            int M = queue.poll();
            queue.add(M);
        }
        int result = queue.poll();
        System.out.println(result);
    }
}
