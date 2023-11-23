package class3.백준1541잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), "-+", true);


        int First = Integer.parseInt(stringTokenizer.nextToken());

        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            if (s.equals("-")) {
                break;
            } else if (s.equals("+")) {
                First += Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            if (!s.equals("-") && !s.equals("+")) {
                First -= Integer.parseInt(s);
            }
        }


        System.out.println(First);


    }

}
