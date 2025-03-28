package ch13_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onDownVolumeUpButton() 메서들 정의하시고
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.

 */
public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
             new PowerButton(), new ChannelDownButton(),new ChannelUpButton(),new VolumeDownButton(), new VolumeUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();
        System.out.println();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
        System.out.println();
        // 물론 메인으로 넘어와서 volumeUpButton을 생성해서 기능을 동작시킬 수는 있습니다.
//        VolumeUpButton volumeUpButton = new VolumeUpButton();
//        System.out.println(volumeUpButton);   // 근데 얘가 논리적이지는 않는 것 같다
        // 기본적으로 TvRemoteController의 일부 기능으로 사용하기 위해 field로 쓰겠다

      /*
            과제 TempDownButton, TempUpButton, ACController 파일을 생성하고
            정의하여
            Main에 ACConttroller 객체를 생성하고

            전원이 켜졌습니다

            온도를 한 칸 내립니다
            ~
            온도를 계속 올립니다

            전원이 꺼졌습니다.
       */

        ACController acController = new ACController(new TempDownButton(), new TempUpButton(), new PowerButton());
        System.out.println("----- 에어컨 리모컨 -----");
        acController.onPressedPowerButton();
        acController.onPressedTempDownButton();
        acController.onDownTempDownButton();
        acController.onPressedTempUpButton();
        acController.onUpTempUpButton();
        acController.onPressedPowerButton();
    }
}
