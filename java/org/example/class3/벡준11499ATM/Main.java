package class3.벡준11499ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        }


        list.sort(Comparator.reverseOrder());

        int result = 0;
        for (int i = N; i >= 1; i--) {
            result += i * list.get(i - 1);
        }


        System.out.println(result);
    }
}
