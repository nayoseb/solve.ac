package class2.백준2108통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받을 숫자의 개수 N
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        // 입력 받은 숫자들을 num 배열에 저장
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        // 평균값을 구하는 부분
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += num[i];
        }
        System.out.println(Math.round(sum / (float) N));

        // CountingSort를 이용해서 정렬을 하는 부분
        int[] count = new int[8001];  // -4000 ~ 4000까지의 숫자를 카운트할 배열

        // 숫자별로 등장하는 횟수를 count 배열에 저장
        for (int i = 0; i < N; i++) {
            count[num[i] + 4000]++;
        }

        //빈도수를 저장하기 위해
        int[] value = count.clone();  // count 배열의 복사본
        for (int i = 1; i < 8001; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // CountingSort의 정렬 과정
        int[] result = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            int temp = count[num[i] + 4000] - 1;
            result[temp] = num[i];
            count[num[i] + 4000] = temp;
        }

        System.out.println(result[N / 2]);

        // 최빈값을 구하는 부분
        int max = 0;
        int cnt = 0, mode = 0;
        for (int i = 0; i < 8001; i++) {
            if (max < value[i]) {
                max = value[i];
            }
        }
        for (int i = 0; i < 8001; i++) {
            if (max == value[i]) {
                cnt++;
                mode = i - 4000;
            }
            // 두 번째로 작은 최빈값이 필요한 경우
            if (cnt == 2) {
                break;
            }
        }
        System.out.println(mode);

        System.out.println(result[N - 1] - result[0]);
    }
}
