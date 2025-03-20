package org.example;

import java.util.Scanner;

public class BmiCalcMain2 {
    public static void main(String[] args) {
        // 사용할 class들을 import
        Scanner scanner = new Scanner(System.in);
        BmiCalc bmiCalc = new BmiCalc();
//
//        // 사용할 변수 목록 선언 및 초기화
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String result = "";

        System.out.println("키(cm)를 입력하세요 >>>");
        height = 172;
        height = scanner.nextDouble(); // 직접입력방법
//        System.out.println("몸무게(kg)를 입력하세요 >>>");
        weight = 70;
//        weight = scanner.nextDouble(); //직접입력방법

//        System.out.println( bmiCalc.getBmi(height, weight));
        bmi =  bmiCalc.getBmi(height, weight); // 메서드의 결과값이 bmi 변수에 저장
//        result = bmiCalc.getResult(bmi);
//        String result2 = bmiCalc.getResult(bmiCalc.getBmi(height,weight)); // 함수형 프로그래밍

        System.out.println("당신의 BMI 지수는" + bmi + "이며" + result + "입니다." );

        BmiCalc bmiCalc1 = new BmiCalc();
        bmiCalc.getBmiResult();
    }
}
