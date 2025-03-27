package ch13_abstraction.interfaces;

public class Power extends Button{
    // 필드 선언
    private boolean stattus;

    @Override
    public void onPressed() {
        if(stattus) {
          stattus = false;
            System.out.println("전원을 끕니다.");
        } else {
            stattus = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
