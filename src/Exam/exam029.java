package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class exam029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        Arrays.sort(A);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            boolean result = false;
            int num = sc.nextInt(); // 체크할 숫자 받기

            int sI = 0;
            int eI = A.length - 1;

            while (sI <= eI) {
                int mI = (sI + eI) / 2;
                int mv = A[mI];

                if (num < mv) eI = mI - 1;
                else if (num > mv) sI = mI + 1;
                else {
                    result = true;
                    break;
                }
            }
            if (result) System.out.println(1);
            else System.out.println(0);
        }
    }
}