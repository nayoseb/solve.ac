package 백준2292벌집;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 1;
        int count = 0;
        while (a > (sum += 6 * count)) {
            count++;
        }
        System.out.println(count + 1);
    }
}
