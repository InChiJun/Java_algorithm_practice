package Exam;

import java.util.Scanner;

public class exam022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        RadixSort(A, 5);
        for (int i = 0; i < N; i++) System.out.println(A[i]);
    }
    private static void RadixSort(int[] A, int max_size) {
        int[] output = new int[A.length];
        int jarisu = 1;
        int count = 0;
        while (count != max_size) {
            int[] bucket = new int[10]; //합배열로 인덱스 저장하는 곳, 인덱스는 자릿수라고 볼 수 있다.
            for (int i = 0; i < A.length; i++) bucket[(A[i] / jarisu) % 10]++; // 각 자릿수에 해당하는 인덱스의 값을 증가시켜준다.
            for (int i = 1; i < 10; i++) bucket[i] += bucket[i - 1]; // 합배열 공식을 적용해서 각 요소가 output 배열의 인덱스를 나타낸다.
            for (int i = A.length - 1; i >= 0; i--) {
                output[bucket[(A[i] / jarisu) % 10] - 1] = A[i]; // bucket의 합배열을 참고하여 output 배열에 삽입
                bucket[(A[i] / jarisu) % 10]--; // 합배열 요소값 -1
            }
            }
            for (int i = 0; i < A.length; i++) A[i] = output[i]; // A배열에 옮겨놓기
            jarisu *= 10;
            count++;
    }
}
