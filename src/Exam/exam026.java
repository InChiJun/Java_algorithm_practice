package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class exam026 {
    static ArrayList<Integer>[] A;
    static Boolean[] visited;
    static int[] searchSequence;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //노드 개수
        int M = sc.nextInt(); //에지 개수
        int V = sc.nextInt(); //시작 노드
        A = new ArrayList[N]; // A 칸 수 정해주기

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>(); //A 각 요소 초기화
            visited[i] = false;
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }

        DFS(V);
    }

    private static void DFS(int v) {
        if (visited[v]) return;
        visited[v] = true;

        for (int i : A[v]) {
            if (!visited[i]) DFS(i);
        }
    }
}