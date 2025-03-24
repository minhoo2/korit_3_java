package ch11_modifier;

import java.util.Scanner;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        // 테스트용 객체 생성
//        BankAccessModifier bankAccessModifier1 = new BankAccessModifier(1234567,"안근수",
//                10000,1234);
//        int pin = 0;
//
//        Scanner scanner = new Scanner(System.in);
//

//        bankAccessModifier1.showInfo();;
//        bankAccessModifier1.deposit(1000,3214); // 입금하는데 비밀번호 틀리면
//        System.out.println(bankAccessModifier1.getBalance());   // 입금되지 않았는지 확인
//        bankAccessModifier1.deposit(-10,1234);  // 입금하는데 음수값
//        bankAccessModifier1.deposit(2000,1234);
//        System.out.println("비밀번호를 입력하세요 >>>");
//        pin = scanner.nextInt();
//        bankAccessModifier1.deposit(3000, pin);

        BankAccessModifier account1 = new BankAccessModifier(123456,"홍길동", 100000,1234);

        BankAccessModifier account2 = new BankAccessModifier(987654,"신사임당",500000,1234);

        account1.showInfo();
        System.out.println();
        account2.showInfo();
        System.out.println();
        account1.deposit(50000,1234);
        //출근 실패 파트
        account1.withdraw(200000,1234);
        account1.withdraw(100000,1234);

        // 2에 해당하는
        account2.withdraw(100000,1234);

        account2.deposit(200000,1234);
        System.out.println();
        account1.showInfo();
        System.out.println();
        account2.showInfo();
    }
}
