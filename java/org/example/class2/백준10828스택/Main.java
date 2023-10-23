package class2.백준10828스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            String s = stringTokenizer.nextToken();

            switch (s) {
                case "push":
                    int num = Integer.parseInt(stringTokenizer.nextToken());
                    stack.push(num);
                    break;

                case "pop":
                    if (stack.empty()) {
                        stringBuilder.append("-1\n");
                    } else {
                        stringBuilder.append(stack.pop() + "\n");
                    }
                    break;

                case "size":
                    stringBuilder.append(stack.size() + "\n");
                    break;
                case "empty":
                    if (stack.empty()) {
                        stringBuilder.append("1\n");
                    } else {
                        stringBuilder.append("0\n");
                    }
                    break;
                case "top":
                    if (stack.empty()) {
                        stringBuilder.append("-1\n");
                    } else {
                        stringBuilder.append(stack.peek() + "\n");
                    }
                    break;
            }
        }
        System.out.print(stringBuilder);
    }
}
