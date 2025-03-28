package ch14_casting.centralcontrol;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("티비의 전원을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("티비의 전원을 끕니다.");
    }
    public void changeChannel() {
        System.out.println("TV 채널을 변경합니다.");
    }
}
