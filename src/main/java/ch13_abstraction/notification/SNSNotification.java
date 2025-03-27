package ch13_abstraction.notification;

public class SNSNotification extends NotificationSystem{
    public SNSNotification(String sender, String recipient, String message, int priority) {
        super(sender, recipient, message, priority);
    }

    @Override
    public void send() {

    }

    @Override
    public void valideteRecipient() {

    }

    @Override
    public void formatMessage() {

    }
}
