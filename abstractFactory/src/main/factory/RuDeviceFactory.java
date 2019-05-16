package main.factory;

import main.DeviceFactory;
import main.device.Keyboard;
import main.device.Mouse;
import main.device.Touchpad;
import main.ruDevice.RuKeyboard;
import main.ruDevice.RuMouse;
import main.ruDevice.RuTouchpad;

public class RuDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
