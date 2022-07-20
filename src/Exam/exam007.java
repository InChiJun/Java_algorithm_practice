package Exam;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class exam007 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int sI = 0;
        int eI = N-1;
        int count = 0;
        while(sI < eI){
            if((arr[sI] + arr[eI]) == M){
                sI++;
                eI--;
                count++;
            }
            else if ((arr[sI] + arr[eI]) < M) sI++;
            else if ((arr[sI] + arr[eI]) > M) eI--;
        }

        System.out.println(count);
    }
}