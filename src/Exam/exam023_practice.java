package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class exam023_practice {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        int count = 0;
        for (int i = 1; i < n + 1; i++) A[i] = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
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
    static void DFS(int v){
        if (visited[v]) return;

        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) DFS(i);
        }
    }
}
