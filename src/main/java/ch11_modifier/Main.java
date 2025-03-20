package ch11_modifier;

class AccessModifierExaample {
    //필드 선언
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    // 메서드 선언
    public void show() {
        System.out.println("public :" + publicVar);
        System.out.println("protected :" + protectedVar);
        System.out.println("default :" + defaultVar);
        System.out.println("private :" + privateVar);
    }
}

public class Main {
    public static void main(String[] args) {
        // 객체 생성(사용할 클래스 import)
        AccessModifierExaample accessModifierExaample = new AccessModifierExaample();
        System.out.println(accessModifierExaample.publicVar);
        System.out.println(accessModifierExaample.protectedVar);
        System.out.println(accessModifierExaample.defaultVar);
//        System.out.println(accessModifierExample.privateVar); // 얘는 오류 발생
    }
}
