package Exam;

import java.util.Scanner;

public class exam019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        quickSort(A, 0, N - 1, K - 1);
        System.out.println(A[K - 1]);
    }

    private static void quickSort(int[] A, int S, int E, int K) {
            int pivot = pivotSolution(A, S, E);
            if (pivot == K) return;
            else if (K < pivot) quickSort(A, S, pivot - 1, K);
            else quickSort(A, pivot + 1, E, K);
    }

    private static int pivotSolution(int[] A, int S, int E) {
        int M = (S + E) / 2;
        swap(A, S, M); //피벗과 첫 요소 스왑
        int i = S, j = E;
        int pivot = A[S];
        while(i < j){
            while(A[j] > pivot) j--;
            while(i < j && A[i] <= pivot) i++;
            swap(A, i, j);
        }
        swap(A, S, i);
        return i;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}