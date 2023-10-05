package 백준4153직각삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            int z = Integer.parseInt(stringTokenizer.nextToken());


            // 0 0 0 을 입력받으면 종료
            if (x == 0 && y == 0 && z == 0) {
                break;
            }


            if ((x * x + y * y) == z * z) {
                System.out.println("right");
            } else if (x * x == (y * y + z * z)) {
                System.out.println("right");
            } else if (y * y == (z * z + x * x)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }

    }
}
