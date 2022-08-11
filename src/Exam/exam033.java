package Exam;

import java.util.*;

public class exam033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) queue.add(A[i]);

        int sum = 0;
        while (queue.size() > 1) {
            int min2 = queue.poll() + queue.poll();
            sum += min2;
            queue.add(min2);
        }

        System.out.println(sum);
    }
}