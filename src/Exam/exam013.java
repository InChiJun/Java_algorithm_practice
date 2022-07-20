package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();

        for (int i = 1; i < N + 1; i++) q.offer(i);

        int num = 0;
        while (q.size() > 1) {
            q.remove();
            num = q.poll();
            q.offer(num);
        }
        System.out.println(num);
    }
}