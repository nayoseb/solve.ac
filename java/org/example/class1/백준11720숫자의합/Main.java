package class1.백준11720숫자의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];

        String nums = scanner.next();


        for (int i = 0; i < N; i++) {
            char c = nums.charAt(i);

            arr[i] = Character.getNumericValue(c);

        }
        scanner.close();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
