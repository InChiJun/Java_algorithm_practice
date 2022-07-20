package Exam;

import java.util.Scanner;

public class exam018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N]; //숫자 배열
        int[] S = new int[N]; //합배열
        for (int i = 0; i < N; i++) A[i] = sc.nextInt(); //숫자 배열 받기

        int insertValue;
        for (int i = 1; i < N; i++){
            insertValue = A[i];
            int insertPoint = i;
            if (i == 1) insertPoint = 0;
            for (int j = i - 1; j >= 0; j--){ //삽입할 위치 찾기
                if (A[j] <= insertValue) {
                    insertPoint = j + 1;
                    break;
                }
            }
            for (int j = i; j > insertPoint; j--){ //오른쪽으로 쉬프트
                A[j] = A[j - 1];
            }
            A[insertPoint] = insertValue;
            S[0] = A[0];
            for (int j = 1; j < N; j++) S[j] = S[j-1] + A[j];
        }

        int sum = 0;
        for (int i = 0; i < N; i++) sum += S[i];
        System.out.println(sum);
    }
}
