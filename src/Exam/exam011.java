package Exam;

import java.util.Scanner;
import java.util.Stack;

public class exam011 { //4단계 예제코드를 보고 작성하였습니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuffer b = new StringBuffer();

        boolean result = true;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int num = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] >= num){
                while(arr[i] >= num){
                    stack.push(num++);
                    b.append("+\n");
                }
                stack.pop();
                b.append("-\n");
            }
            else{
                int number = stack.pop();
                if(number > arr[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else b.append("-\n");
            }
        }
        if(result) System.out.println(b.toString());
    }
}
