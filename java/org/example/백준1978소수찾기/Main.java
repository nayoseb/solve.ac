package org.example.백준1978소수찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (isprime(b[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isprime(int a) {
        if (a == 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a%i ==0) return false;
        }
        return true;
    }
}
