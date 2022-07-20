package Exam;

import java.util.Scanner;

public class exam015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N - 1; j++){
                if (arr[j] > arr[j+1]) swap(arr, j, j+1);
            }
        }
        for (int i = 0; i < N; i++) System.out.println(arr[i]);
    }
    public static <Integer> void swap(int[] arr, int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
