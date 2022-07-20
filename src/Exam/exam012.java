package Exam;

import java.util.Scanner;
import java.util.Stack;

public class exam012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt(); // 수열 받기

        for(int i = 0; i < N; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                result[i] = arr[stack.pop()];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) result[stack.pop()] = -1;

        for (int i = 0; i < N; i++){
            System.out.print(result[i] + " ");
        }
    }
}