package Exam;
import java.util.Scanner;
public class exam003 {
    public static void main(String[] args) {
        // 교재의 코드와 매우 다릅니다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] S = new int[N + 1];

        for(int i = 1; i < arr.length; i++){
            arr[i] = sc.nextInt();
            S[i] = S[i-1] + arr[i];
        }

        for(int l = 0; l < M; l++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(S[j] - S[i -1]);
        }
    }
}