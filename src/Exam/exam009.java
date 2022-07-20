package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam009 { //4단계 예제 코드를 보고 작성하였습니다.
    static int[] checkArr; //클래스 내의 모든 곳에서 사용할 수 있는 static 멤버이다.
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken()); // 전체 문자열 길이
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열 길이
        int Result = 0;
        char A[]; //S 문자형 배열
        checkArr = new int[4]; //비밀번호 체크 배열
        myArr = new int[4];
        checkSecret = 0;
        A = bf.readLine().toCharArray(); //S를 문자혈 배열인 A에 저장
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken()); //비밀번호 체크 배열 채우기
            if (checkArr[i] == 0) checkSecret++; // 조건이 0이면 어떤 것이 와도 상관 없으니 ++해준다.
        }

        for (int i = 0; i < P; i++) Add(A[i]); //Add함수를 호출하여 부분 배열에 값 삽입

        if (checkSecret == 4) Result++; // 조건이 모두 충족되면 출력값에 ++해준다.

        for(int i = P; i < S; i++){ // 다음 인덱스로 슬라이딩할 때 조건에 부합한지 확인한다.
            int j = i - P;
            Add(A[i]); //맨 끝 인덱스 넣어주기
            Remove(A[j]); //맨 처음 인덱스 빼주기
            if (checkSecret == 4) Result++;
        }
        System.out.println(Result);
        bf.close();
    }

    private static void Add(char c) { //새로 들어온 문자를 처리하는 함수
        switch (c) {
            case 'A' -> {
                myArr[0]++; //새로 들어온 문자가 A면 myArr 0번 인덱스 ++
                if (myArr[0] == checkArr[0]) checkSecret++; //들어온 문자가 A이면 checkSecret++
            }
            case 'C' -> {
                myArr[1]++; //새로 들어온 문자가 C면 myArr 1번 인덱스 ++
                if (myArr[1] == checkArr[1]) checkSecret++; //들어온 문자가 C이면 checkSecret++
            }
            case 'G' -> {
                myArr[2]++; //새로 들어온 문자가 G면 myArr 2번 인덱스 ++
                if (myArr[2] == checkArr[2]) checkSecret++; //들어온 문자가 G이면 checkSecret++
            }
            case 'T' -> {
                myArr[3]++; //새로 들어온 문자가 T면 myArr 3번 인덱스 ++
                if (myArr[3] == checkArr[3]) checkSecret++; //들어온 문자가 T이면 checkSecret++
            }
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A' -> {
                if (myArr[0] == checkArr[0]) checkSecret--; //나가는 문자가 A이면 checkSecret--
                myArr[0]--; // A 인덱스 --
            }
            case 'C' -> {
                if (myArr[1] == checkArr[1]) checkSecret--; //나가는 문자가 C이면 checkSecret--
                myArr[1]--; // C 인덱스 --
            }
            case 'G' -> {
                if (myArr[2] == checkArr[2]) checkSecret--; //나가는 문자가 G이면 checkSecret--
                myArr[2]--; // G 인덱스 --
            }
            case 'T' -> {
                if (myArr[3] == checkArr[3]) checkSecret--; //나가는 문자가 T이면 checkSecret--
                myArr[3]--; // T 인덱스 --
            }
        }
    }
}