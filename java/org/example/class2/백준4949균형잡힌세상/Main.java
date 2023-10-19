package class2.백준4949균형잡힌세상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            String s = bufferedReader.readLine();
            if (s.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '[' || ch == '(') {
                    stack.push(ch);
                } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if (ch == ')' || ch == ']') {
                    isBalanced = false;
                    break;
                }

            }

            if (isBalanced && stack.empty()) {
                stringBuilder.append("yes\n");
            } else {
                stringBuilder.append("no\n");
            }
        }

        System.out.print(stringBuilder);
    }
}
