package Exam;

import java.util.*;

public class exam034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int il = 0;
        int zero = 0;
        int sum = 0;
        int N = sc.nextInt();
        int data = 0;
        PriorityQueue<Integer> minusq = new PriorityQueue<>(); // 음수 큐
        PriorityQueue<Integer> plusq = new PriorityQueue<>(Collections.reverseOrder()); // 양수 큐

        for (int i = 0; i < N; i++) {
            data = sc.nextInt();
            if (data == 0) zero++;
            else if (data == 1) il++;
            else if (data < 0) minusq.add(data);
            else plusq.add(data);
        }

        int bind = 0;

        while (minusq.size() > 1) {
            bind = minusq.poll() * minusq.poll();
            sum += bind;
        }
        if (minusq.size() == 1) {
            if (zero > 0) zero--;
            else sum += minusq.poll();
        }

        while (plusq.size() > 1) {
            bind = plusq.poll() * plusq.poll();
            sum += bind;
        }
        if (plusq.size() == 1) sum += plusq.poll();

        sum += il;
        System.out.println(sum);
    }
}