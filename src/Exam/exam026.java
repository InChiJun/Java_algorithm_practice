package Exam;

import java.util.*;

public class exam026 {
    static ArrayList<Integer>[] A;
    static Boolean[] visited;
    static List<Integer> BsearchSequence;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //노드 개수
        int M = sc.nextInt(); //에지 개수
        int V = sc.nextInt(); //시작 노드
        visited = new Boolean[N + 1];
        A = new ArrayList[N + 1]; // A 칸 수 정해주기
        BsearchSequence = new ArrayList<Integer>();

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>(); //A 각 요소 초기화
            visited[i] = false;
        }
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 1; i <= N; i++) Collections.sort(A[i]);
        DFS(V);
        for (int i = 1; i <= N; i++) visited[i] = false;
        System.out.println();
        BFS(V);
    }

    private static void BFS(int v) {
        Queue<Integer> queue= new LinkedList<Integer>();
        if (visited[v]) return;
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (int i : A[now]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    private static void DFS(int v) {
        if (visited[v]) return;
        visited[v] = true;
        System.out.print(v + " ");

        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}