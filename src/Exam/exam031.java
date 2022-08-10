package Exam;

import java.util.Scanner;

public class exam031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int startIndex = 1;
        int endIndex = k;
        int answer = 0;

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            int divide = 0;
            int count = 0;

            for (int i = 1; i <= N; i++) {
                divide = mid / i;
                if (divide < N) count += divide;
                else count += N;
            }

            if (count < k) startIndex = mid + 1;
            else {
                endIndex = mid - 1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }
}
