package class2.백준10814나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

/*  Person 객체 생성해서 푸는 방법

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        Person[] arr = new Person[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            arr[i] = new Person(Integer.parseInt(stringTokenizer.nextToken()), stringTokenizer.nextToken());
        }

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < N; i++) {
            stringBuilder.append(arr[i].age + " ");
            stringBuilder.append(arr[i].name + "\n");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1));


    }


    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
*/

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        String[][] arr = new String[N][2];


        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            arr[i][0] = stringTokenizer.nextToken();    // 나이
            arr[i][1] = stringTokenizer.nextToken();    // 이름

        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            stringBuilder.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1));
    }


}
