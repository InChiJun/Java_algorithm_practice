package Exam;

import java.util.Scanner;

public class exam006 { //4단계 예제코드를 참고하여 풀었습니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sI = 1;
        int eI = 1;
        int count = 1;
        int sum = 1;

        while(eI != N){
            if (sum == N) {count++; eI++; sum += eI;}
            else if (sum > N) {sum -= sI; sI++;}
            else if (sum < N) {eI++; sum += eI;}
        }
        System.out.println(count);
    }
}