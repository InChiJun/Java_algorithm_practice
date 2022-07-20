package Exam;
import java.util.Scanner;
public class exam001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();
        char[] chr = numbers.toCharArray();
        int sum = 0;
        for (int i = 0; i < chr.length; i++) {
            sum += chr[i] - '0';
        }
        System.out.println(sum);
    }
}