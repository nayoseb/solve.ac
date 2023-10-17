package class2.백준11651좌표정렬하기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        Coordinate[] arr = new Coordinate[N];

        for (int i = 0; i < N; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            Coordinate coordinate = new Coordinate(Integer.parseInt(stringTokenizer.nextToken()),
                    Integer.parseInt(stringTokenizer.nextToken()));
            arr[i] = coordinate;
        }

        Arrays.sort(arr, new Comparator<Coordinate>() {
            @Override
            public int compare(Coordinate o1, Coordinate o2) {
                if (o1.row < o2.row) {
                    return -1;
                } else if (o1.row == o2.row) {
                    return o1.column - o2.column;
                }
                return 1;
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringBuilder.append(arr[i].column + " " + arr[i].row + "\n");
        }

        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1));


    }

    public static class Coordinate {
        int column;
        int row;

        public Coordinate(int column, int row) {
            this.column = column;
            this.row = row;
        }


    }
}
