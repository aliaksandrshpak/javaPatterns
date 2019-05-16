package main;

import main.device.Keyboard;
import main.device.Mouse;
import main.device.Touchpad;

public interface DeviceFactory {
    public Mouse getMouse();
    public Keyboard getKeyboard();
    public Touchpad getTouchpad();
}
