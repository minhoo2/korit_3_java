package ch10_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        // 객체 생성
        UnivStudent student1 = new UnivStudent();
        UnivStudent student2 = new UnivStudent();
        UnivStudent student3 = new UnivStudent();
        UnivStudent student4 = new UnivStudent();
        UnivStudent student5 = new UnivStudent();

        // 객체에 값 대입 -> 실패한  후까지 고려하여 성공까지 다 집어넣었습니다.
        student1.setName("김일");
        student1.setGrade(3);
        student1.setScore(3.3);

        student2.setName("김이");
        student2.setGrade(5);
        student2.setScore(-3.0);
        student2.setScore(2.7);

        student3.setName("김삼");
        student3.setGrade(15);
        student3.setGrade(2);
        student3.setScore(2.7);

        student4.setName("김사");
        student4.setGrade(4);
        student5.setScore(3.8);

        student5.setName("김오");
        student5.setGrade(2);
        student5.setScore(1.0);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }
}


