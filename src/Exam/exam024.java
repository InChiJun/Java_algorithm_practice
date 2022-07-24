package Exam;

import java.util.Scanner;

public class exam024 {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    private static void DFS(int number, int jarisu) {
        if (isPrime(number) && jarisu == N) { //소수이면서 자리수도 맞으면 출력
            System.out.println(number);
            return;
        }
        for (int i = 1; i < 10; i += 2) {
            if (isPrime(number * 10 + i)) {
                DFS(number * 10 + i, jarisu + 1); //10의 자리부턴 1~9 홀수만 대입해서 DFS 실행
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) if (num % i == 0) return false;
        return true;
    }
}
