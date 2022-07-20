package Exam;

import java.util.Scanner;

public class exam021 {
    public static int[] A, tmp;
    public static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new int[N + 1];
        tmp = new int[N + 1];
        int[] cmp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            cmp[i] = A[i];
        }

        result = 0;
        mergeSort(1, N);
        System.out.println(result);
    }

    private static void mergeSort(int s, int e) {
        if (e - s < 1) return;
        int m = (s + e) / 2;
        mergeSort(s, m);
        mergeSort(m + 1, e);
        int k = s;
        int index1 = s;
        int index2 = m + 1;
        for (int i = s; i <= e; i++) tmp[i] = A[i];
        while (index1 <= m && index2 <= e){
            if (tmp[index1] < tmp[index2]){
                A[k] = tmp[index1];
                index1++;
            }
            else{
                result += index2 - k;
                A[k] = tmp[index2];
                index2++;
            }
            k++;
        }
        while (index1 <= m){
            A[k] = tmp[index1];
            k++;
            index1++;
        }
        while (index2 <= e){
            A[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
