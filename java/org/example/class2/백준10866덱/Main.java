package class2.백준10866덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String s = stringTokenizer.nextToken();
            switch (s) {
                case "push_front":
                    int num = Integer.parseInt(stringTokenizer.nextToken());
                    deque.addFirst(num);
                    break;
                case "push_back":
                    int num1 = Integer.parseInt(stringTokenizer.nextToken());
                    deque.addLast(num1);
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        stringBuilder.append("-1" + "\n");
                    } else {
                        stringBuilder.append(deque.pollFirst() + "\n");
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        stringBuilder.append("-1" + "\n");
                    } else {
                        stringBuilder.append(deque.pollLast() + "\n");
                    }
                    break;

                case "size":
                    stringBuilder.append(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        stringBuilder.append("1" + "\n");
                    } else {
                        stringBuilder.append("0" + "\n");
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        stringBuilder.append("-1" + "\n");
                    } else {
                        stringBuilder.append(deque.getFirst() + "\n");
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        stringBuilder.append("-1" + "\n");
                    } else {
                        stringBuilder.append(deque.getLast() + "\n");
                    }
                    break;
            }
        }
        System.out.println(stringBuilder);
    }
}
