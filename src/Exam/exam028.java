package Exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam028 {
    static ArrayList<Edge>[] A;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) A[i] = new ArrayList<Edge>(); // A 인접리스트 초기화

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            while (true) {
                int e = sc.nextInt();
                if (e == -1) break;
                int value = sc.nextInt();
                A[S].add(new Edge(e, value));
            }
        }
        visited = new boolean[N + 1];
        distance = new int[N + 1];
        BFS(2);
        int max = 1;
        for (int i = 1; i <= N; i++) {
            if (distance[i] > distance[max]) {
                max = i;
            }
        }

        visited = new boolean[N + 1];
        distance = new int[N + 1];
        BFS(max);
        max = 0;
        for (int i = 1; i <= N; i++) {
            if (distance[i] > max) max = distance[i];
        }

        System.out.println(max);
    }

    private static void BFS(int S) {
        int max = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(S);
        visited[S] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Edge i : A[node]) {
                int e = i.e;
                int value = i.value;
                if (!visited[e]) {
                    queue.add(e);
                    visited[e] = true;
                    distance[e] = distance[node] + value;
                }
            }
        }
    }
}

class Edge {
    int e; // 목적지 노드
    int value; // 가중치

    public Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }
}