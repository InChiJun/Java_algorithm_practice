package Exam;

import java.util.Scanner;

public class exam031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[][] A = new int[N + 1][N + 1];
        int startIndex = 1;
        int endIndex = k;

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            int count = 0;
        }
    }
}
