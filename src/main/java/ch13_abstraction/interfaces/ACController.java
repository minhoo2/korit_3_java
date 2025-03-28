package ch13_abstraction.interfaces;

public class ACController {
    private TempDownButton tempDownButton;
    public  TempUpButton tempUpButton;
    public PowerButton powerButton;

    public ACController(TempDownButton tempDownButton, TempUpButton tempUpButton, PowerButton powerButton) {
        this.tempDownButton = tempDownButton;
        this.tempUpButton = tempUpButton;
        this.powerButton = powerButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    public void onPressedTempDownButton() {
        tempDownButton.onPressed();
    }
    public void onDownTempDownButton() {
        tempDownButton.onDown();
    }
    public void onPressedTempUpButton() {
        tempUpButton.onPressed();
    }
    public void onUpTempUpButton() {
        System.out.println(tempUpButton.onUp());
    }
}


