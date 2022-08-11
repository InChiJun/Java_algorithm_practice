package Exam;

import java.util.Scanner;

public class exam032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int k = 4790;
        int[] A = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int coin = 0;

        for (int i = N - 1; i > 0; i--) {
            if (k >= A[i]) {
                coin += k / A[i];
                k %= A[i];
            }
        }

        System.out.println(coin);
    }
}
