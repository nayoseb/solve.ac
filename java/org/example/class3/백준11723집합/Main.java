package class3.백준11723집합;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int m = scanner.nextInt();
        scanner.nextLine();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            String arr[] = scanner.nextLine().split(" ");
            switch (arr[0]) {
                case "add":
                    set.add(Integer.parseInt(arr[1]));
                    break;
                case "remove":
                    if (set.contains(Integer.parseInt(arr[1]))) {
                        set.remove(Integer.parseInt(arr[1]));
                    }
                    break;
                case "check":
                    if (set.contains(Integer.parseInt(arr[1]))) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "toggle":
                    if (set.contains(Integer.parseInt(arr[1]))) {
                        set.remove(Integer.parseInt(arr[1]));
                    } else {
                        set.add(Integer.parseInt(arr[1]));
                    }
                    break;
                case "all":
                    for (int j = 1; j < 21; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}
