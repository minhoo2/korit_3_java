package ch13_abstraction.notification;

public class NotificationMain {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("adim@test.com",
                "user@example.com","가입 대기", 1);

        emailNotification.setPriority(8);                       // 불가능
        System.out.println(emailNotification.getPriority());    // 여전히 1임을 확인 가능
        emailNotification.printNotificationInfo();
        emailNotification.valideteRecipient();      // 얘는 만들 때 똑바로 만들어놨기 때문에
        // 실패 사례를 확인하고 싶다면 추가적인 객체를 생성하거나 혹은 setter를 통해
        // recipient 필드를 수정하는 방법도 고려할 수 있겠습니다. -> setter를 만든다면
        // NotificationSysttem에 setRecipient를 추가해야겠죠.
        emailNotification.send();;
        emailNotification.updateMassage("가입 승인");
    }
}
