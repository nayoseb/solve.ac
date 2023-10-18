package class2.백준2839설탕배달;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        boolean isOk = false;
        int portion = N / 5;
        int result = 0;

        while (portion >= 0) {
            if (N%5==0) {
                result = portion;
                isOk=true;
                break;
            } else if ((N - 5*portion)%3==0) {
                result = portion + (N - 5*portion)/3;
                isOk=true;
                break;
            } else
                portion--;
        }
        if (isOk==true) {
            System.out.println(result);
        } else System.out.println("-1");




    }
}
