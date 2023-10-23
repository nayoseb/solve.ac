package class2.백준18110solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        double people = ((n * 0.3) / 2);
        int peoplenum = (int) Math.round(people);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);


        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            deque.push(arr[i]);
        }

        for (int i = 0; i < peoplenum; i++) {
            deque.removeLast();
            deque.removeFirst();
        }
        double result = 0;

        while (!deque.isEmpty()) {
            result += deque.pop();
        }

        System.out.println(Math.round(result / (n - 2 * peoplenum)));


    }
}
