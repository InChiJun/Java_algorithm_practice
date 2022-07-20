package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[N];
        int[] S = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i == 0){
                S[0] = arr[0];
                continue;
            }
            S[i] = S[i-1] + arr[i]; //합배열
        }

        int count = 0;
        int d = 0;
        for(int i = 0; i < N; i++){
            for(int j = N-1; j > 0; j--) {
                if (i == 0){
                    if(S[j] % M == 0) count++;
                }

                else if (i > 0){
                    d = S[j] - S[i-1];
                    if(d % M == 0) count++;
                }
            }

        }
        System.out.println(count);
    }
}