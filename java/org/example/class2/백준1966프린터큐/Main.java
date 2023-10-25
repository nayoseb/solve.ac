package class2.백준1966프린터큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수를 입력 받는다.
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 문서의 개수 N과 몇 번째로 인쇄되었는지 궁금한 문서의 위치 M을 입력 받는다.
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 문서의 위치를 저장하는 큐
            Queue<Integer> indexQueue = new LinkedList<>();
            // 문서의 중요도를 저장하는 큐
            Queue<Integer> priorityQueue = new LinkedList<>();
            // 문서들의 중요도를 정렬하여 저장하는 리스트
            List<Integer> priorities = new ArrayList<>();

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                int priority = Integer.parseInt(st.nextToken());
                // 현재 문서의 위치와 중요도를 각각의 큐에 추가
                indexQueue.add(j);
                priorityQueue.add(priority);
                // 현재 문서의 중요도를 리스트에 추가
                priorities.add(priority);
            }

            // 중요도를 내림차순으로 정렬
            Collections.sort(priorities, Collections.reverseOrder());

            int printOrder = 0;
            // 모든 문서가 인쇄될 때까지 반복
            while (!indexQueue.isEmpty()) {
                int currentIndex = indexQueue.poll();
                int currentPriority = priorityQueue.poll();

                // 현재 문서의 중요도가 가장 높다면 인쇄
                if (currentPriority == priorities.get(0)) {
                    printOrder++;
                    // 리스트에서 가장 높은 중요도를 제거
                    priorities.remove(0);
                    // 인쇄된 문서가 궁금한 문서라면 결과 출력
                    if (currentIndex == M) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {
                    // 현재 문서의 중요도가 가장 높지 않다면 다시 큐의 끝에 추가
                    indexQueue.add(currentIndex);
                    priorityQueue.add(currentPriority);
                }
            }
        }
    }
}
