package Exam;
import java.util.Scanner;
public class exam002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < scores.length; i++){
            scores[i] = sc.nextInt();
        }

        int sum = 0;
        int max = scores[0];
        for (int i = 0; i < scores.length; i++){
            if(max < scores[i]){
                max = scores[i];
            }
            sum += scores[i];
        }
        System.out.println(sum * 100 / max / scores.length);
    }
}