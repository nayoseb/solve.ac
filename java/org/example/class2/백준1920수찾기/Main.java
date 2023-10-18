package class2.백준1920수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[N];

        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer1.nextToken());
        }



        int M = Integer.parseInt(bufferedReader.readLine());

        int[] arr1 = new int[M];
        StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < M; i++) {
            arr1[i] = Integer.parseInt(stringTokenizer2.nextToken());
        }


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < M; i++) {
            boolean isExist = false;
            for (int j = 0; j < N; j++) {
                if (arr1[i]==arr[j]) {
                    stringBuilder.append("1"+"\n");
                    isExist = true;
                    break;
                }

            }
            if (!isExist) {
                stringBuilder.append("0"+"\n");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);

        System.out.println(stringBuilder);


    }
}
