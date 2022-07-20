package Exam;

import java.util.Scanner;

public class exam020 {
    public static int[] A, tmp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new int[N + 1];
        tmp = new int[N + 1];
        for (int i = 1; i < N + 1; i++){
            A[i] = sc.nextInt();
        }

        mergeSort(1, N);
        for (int i = 1; i < N + 1; i++) System.out.println(A[i]);
    }

    private static void mergeSort(int s, int e) {
        if (e - s < 1) return;
        int m = (s + e) / 2;
        mergeSort(s, m);
        mergeSort(m + 1, e);

        for (int i = s; i <= e; i++) tmp[i] = A[i];

        int k = s;
        int index1 = s;
        int index2 = m + 1;
        while (index1 <= m  && index2 <= e){ //병합정렬 과정
            if (tmp[index1] < tmp[index2]){
                A[k] = tmp[index1];
                index1++;
            }
            else {
                A[k] = tmp[index2];
                index2++;
            }
            k++;
        }
        while (index1 <= m){ //0~m 인덱스 중 담기지 않은 나머지 요소들 A배열에 추가
            A[k] = tmp[index1];
            index1++;
            k++;
        }
        while (index2 <= e) {//m+1~e 인덱스 중 담기지 않은 나머지 요소들 A배열에 추가
            A[k] = tmp[index2];
            index2++;
            k++;
        }
    }
}