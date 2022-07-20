package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class exam016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        mData[] A = new mData[N]; //mData 클래스 타입의 배열 생성

        for (int i = 0; i < N; i++) A[i] = new mData(sc.nextInt(), i); //배열 요소와 인덱스를 받으면서 mData 인스턴스 생성

        Arrays.sort(A);
        int Max = 0;
        for (int i = 0; i < N; i++) if(Max < A[i].index -i) Max = A[i].index - i;
    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    public int compareTo(mData o){
        return this.value - o.value; //비교값 리턴
    }
}