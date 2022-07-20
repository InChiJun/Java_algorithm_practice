package Exam;

import java.util.Scanner;

public class exam017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] A = new int[N.length()];
        for (int i = 0; i < N.length(); i++) A[i] = Integer.parseInt(N.substring(i, i+1)); // A배열에 요소 저장

        int index = 0;
        int max;
        for(int i = 0; i < N.length(); i++){

            max = 0;
            int m = 0; // max값 인덱스
            for(int j = index; j < N.length(); j++) {
                if(max < A[j]) {
                    max = A[j];
                    m = j;

                }
            }
            swap(A, index, m);
            index++;
        }

        for(int i = 0; i < A.length; i++) System.out.print(A[i]);
    }
    public static <Integer> void swap(int[] arr, int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}