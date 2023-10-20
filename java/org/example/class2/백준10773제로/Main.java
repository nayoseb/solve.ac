package class2.백준10773제로;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int result = 0;
        Stack<Integer> stack = new Stack<>();



        for (int i = 0; i < K; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                stack.pop();
            } else
                stack.push(num);
        }

        while (!stack.empty()) {
            result+=stack.pop();
        }

        System.out.println(result);


    }
}
