package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체인 person1을 만든다고 가정하겠습니다.
//        Person person1 = new Person("안근수", 38, "부산광역시 연제구");
        // 이상이 여태까지의 방식이고
        // 빌더 적용시에는
        Person person1 = new Person.Builder()
//                .address("부산광역시 연제구")
//                .name("안근수")
                .age(38)
                .build();

        System.out.println(person1);
    }
}
