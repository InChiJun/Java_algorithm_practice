package Exam;
import java.util.ArrayList;
import java.util.Scanner;

public class exam023 {
    static ArrayList<Integer>[] A; //리스트를 배열형식으로 쓰는 이유가 뭘까?
    static boolean[] visited; //방문 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //노드
        int m = sc.nextInt(); //에지
        A = new ArrayList[n + 1]; //배열의 크기를 왜 main 안에서 정할까?
        visited = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) A[i] = new ArrayList<Integer>(); //초기화를 왜 할까?

        int count = 0;
        for (int i = 0; i < m; i++){ // 인접 리스트에 양방향 노드 저장
            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) return;
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) DFS(i);
        }
    }
}