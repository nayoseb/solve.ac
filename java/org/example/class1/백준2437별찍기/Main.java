package class1.백준2437별찍기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;


        while (count != N) {

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i <= count; i++) {
                stringBuilder.append("*");
            }
            System.out.println(stringBuilder);
            count++;
        }
    }
}
