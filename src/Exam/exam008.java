package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class exam008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        Arrays.sort(A);

        int count = 0;
        for(int k = 0; k < N; k++){ //k는 인덱스
            int sI = 0; //시작 포인터
            int eI = N - 1; // 끝 포인터
            long find = A[k];
            while (sI < eI){
                int sum = A[sI] + A[eI];
                if(sum == find){
                    if(sI == k) sI++;
                    else if(eI == k) eI--;
                    else{
                        count++;
                        break;
                    }
                }
                else if(sum < find) sI++;
                else if(sum > find) eI--;
            }
        }

        System.out.println(count);
    }
}