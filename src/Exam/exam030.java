package Exam;

import java.util.Scanner;

public class exam030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //레슨 수
        int M = sc.nextInt(); //블루레이 수
        int[] A = new int[N];
        int LI = 0; // A 요소 합_마지막 인덱스
        int FI = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // A요소 받기
            if (FI < A[i]) FI = A[i];
            LI += A[i];
        }

        int mid = 0;

        while (FI <= LI) {
            mid = (FI + LI) / 2; // 중간 인덱스
            int count = 0;
            int sum = 0;

            for (int i = 0; i < N; i++) {
                if (sum + A[i] > mid) { // 블루레이가 가득 찼다면 합 초기화, 카운트++
                    sum = 0;
                    count++;
                }
                sum += A[i];
            }
            if (sum != 0) count++;

            if (count > M) FI = mid + 1;
            else LI = mid - 1;
        }

        System.out.println(FI);
    }
}
