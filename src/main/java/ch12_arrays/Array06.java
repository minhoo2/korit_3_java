package ch12_arrays;
/*
    1. calcSum / calcAvg 메서드를 완성하고, main 단계의 메서드 호출 부분을 수정해서
    실행 예
    총합 : 몇점
    평균 : 몇점
 */
public class Array06 {
    // 총합을 구하는 메서드
    private int calcSum(int[] scores) {
        int sum = 0;    // 지역 변수
        for(int i = 0 ; i < scores.length ; i++) {
            sum += scores[i];
        }

        return sum;
    }
    // 평균을 구하는 메서드
    private double calcAvg(int[] scores) {
//        int sum = 0;
        double avg = 0;
//        for(int i = 0 ; i < scores.length ; i++) {
//            sum += scores[i];
//        }  보니까 이 부분이 calcSum과 반복 -> 그리고 이 연산의 결과가 sum
//        sum = calcSum(scores);
        avg = (double)calcSum(scores) / scores.length;

        return avg;
    }

    // 등급 인원수를 구하는 메서드 -> call3()로 작성
    private void countGrade(int[] scores) {
        int[] grades = {0, 0, 0, 0, 0, 0};
        for(int i = 0 ; i < scores.length ; i++) {
            if (scores[i] > 89) {
                grades[0]++;
            } else if (scores[i] > 79) {
                grades[1]++;
            } else if (scores[i] > 69) {
                grades[2]++;
            } else if (scores[i] > 59) {
                grades[3]++;
            } else {
                grades[4]++;
            }
        }
        System.out.println("A 학점 인원 수  : " + grades[0]);
        System.out.println("B 학점 인원 수  : " + grades[1]);
        System.out.println("C 학점 인원 수  : " + grades[2]);
        System.out.println("D 학점 인원 수  : " + grades[3]);
        System.out.println("F 학점 인원 수  : " + grades[4]);
    }

    public void printTotalInfo(int[] scores) {
        // 얘만 실행시키면 합계도 나오고 평균도 나오고, A-F 인원수도 다 나왔으면 좋겠어요.
        System.out.println("총합 : " + calcSum(scores));
        System.out.println("평균 : " + calcAvg(scores));
        countGrade(scores);

    }


    public static void main(String[] args) {
        // Array06 클래스의 메서드를 호출하기 위한 객체 생성
        Array06 array06 = new Array06();
        // 점수 데이터를 사전에 마련해놓겠습니다.

        int[] scores = {100, 97, 55, 24, 49, 60, 20, 77, 89,};

//        int total = array06.calcSum(scores);    // 합 구하는 메서드 호출
//        System.out.println("총합 : " + total) ;
//        double avgScore = array06.calcAvg(scores);  // 평균 구하는 메서드 호출
//        System.out.println("평균 : " + avgScore);
//        array06.countGrade(scores); // A인원수 ... F인원수를 구하는 메서드 호출

        array06.printTotalInfo(scores);
    }
}
