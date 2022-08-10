package Exam;

import java.util.Scanner;

public class exam032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[N];
        int coin = 0;
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        for (int i = N - 1; i > 0; i++) {
            if (k >= A[i]) {
                coin += k / A[i];
                k %= A[i];
            }
        }

        System.out.println(coin);
    }
}
