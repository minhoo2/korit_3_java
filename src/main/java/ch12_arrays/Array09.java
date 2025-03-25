package ch12_arrays;

import java.util.Scanner;

/*

                실행 예
            몇 명의 학생을 등록하시겠습니까? >>> 15
             1 번 학생 이 름 : 강수림
             2 번 학생 이 름 : 기준성
             3 번 학생 이 름 : 김미진
             4 번 학생 이 름 : 김준식
             5 번 학생 이 름 : 문성진
             6 번 학생 이 름 : 심민호
             7 번 학생 이 름 : 양지은
             8 번 학생 이 름 : 유지현
             9 번 학생 이 름 : 윤현지
            10 번 학생 이 름 : 이동규
            11 번 학생 이 름 : 이예성
            12 번 학생 이 름 : 이정화
            13 번 학생 이 름 : 전용남
            14 번 학생 이 름 : 채수원
            15 번 학생 이 름 : 한영진

       일반 for문으로 출력 (근데 이건 복사넣기 하면 되죠)
       향상된 for문으로 이름만 출력하겠습니다
       실행 예
       강수림
       기준성
       ...
       한영진
 */
public class Array09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 명의 학생을 등록하시겠습니까? >>>");
        int indexNum = scanner.nextInt();
        scanner.nextLine();     // 베리어
        String[] students = new String[indexNum];
        // 입력 part는 일반 for문
        for(int i = 0 ; i < students.length ; i++) {    // students.length == indexNum
            System.out.println((i+1) + "번 학생 등록 :");
            students[i] = scanner.nextLine();
        }
        // 출력 part는 일반 for문 한 번 향상된 for문 한 번해서 두 번 출력됩니다.
        // 일반 for문
        for(int i = 0 ; i < students.length ; i++) {
            System.out.println(students[i]);
        }
        // 향상된 for문
        for(String student : students) {
            System.out.println(student);
        }
    }
}
