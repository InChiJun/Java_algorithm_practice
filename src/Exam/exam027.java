package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam027 {
    static int[][] arr;
    static int[][] count;
    static boolean[][] checked;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 행
        M = sc.nextInt(); // 열
        arr = new int[N + 1][M + 1];
        count = new int[N + 1][M + 1];
        count[1][1] = 1;
        checked = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; i++) { // 2차원 배열 받기
            for (int j = 1; j <= M; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 0) checked[i][j] = true;
                else checked[i][j] = false;
            }
        }
        MiroSearch(1, 1);
        System.out.println(count[N][M]);
    }

    private static void MiroSearch(int x, int y) {
        if (x == N && y == M) return;

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{x, y});
        if (!checked[x][y]) checked[x][y] = true;

        while (!queue.isEmpty()) { // 큐가 빌 때까지 반복
            int[] now = queue.poll(); // now[0] = 큐의 x좌표, now[1] = 큐의 y좌표
            if (now[0] + 1 <= N && !checked[now[0] + 1][now[1]]) { // x + 1을 방문한 적 없으면
                checked[now[0] + 1][now[1]] = true; // x + 1 방문배열 체크
                queue.add(new int[]{now[0] + 1, now[1]}); // (x + 1, y) 큐에 삽입
                count[now[0] + 1][now[1]] += count[now[0]][now[1]];
            } if (now[1] + 1 <= M && !checked[now[0]][now[1] + 1]) { // y + 1을 방문한 적 없으면
                checked[now[0]][now[1] + 1] = true; // y + 1 방문배열 체크
                queue.add(new int[]{now[0], now[1] + 1}); // (x, y + 1) 큐에 삽입
                count[now[0]][now[1] + 1] += count[now[0]][now[1]];
            }
        }
    }
}