package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("김일");
        System.out.println(user1);

         /*
        username에 2
        password 1357
        email b@test.com
        name에 김이을 입력한 뒤에

        getter를 활용하여
        username : 2
        password : 1357
        email : b@test.com
        이름 : 김이

        가 출력되도록 main에 작성해보시오.
        */
        UserEntityLombok user2 = new UserEntityLombok();

        user2.setUsername(2);
        user2.setPassword(1357);
        user2.setEmail("b@test.com");
        user2.setName("김이");

        System.out.println("username : " + user2.getUsername());
        System.out.println("password : " + user2.getPassword());
        System.out.println("email : " + user2.getEmail());
        System.out.println("이름 : " + user2.getName());


    }
}
