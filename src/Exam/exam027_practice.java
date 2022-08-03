package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam027_practice {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] A;
    static boolean[][] visited;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) A[i][j] = sc.nextInt();
        }
        DFS(0, 0);
        System.out.println(A[N - 1][M - 1]);
    }

    private static void DFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (!visited[x][y] && A[x][y] != 0) {
                        visited[x][y] = true;
                        queue.add(new int[] {x, y});
                        A[x][y] += A[now[0]][now[1]];
                    }
                }
            }
        }
    }
}
