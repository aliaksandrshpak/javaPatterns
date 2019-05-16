package main.factory;

import main.DeviceFactory;
import main.device.Keyboard;
import main.device.Mouse;
import main.device.Touchpad;
import main.enDevice.EnKeyboard;
import main.enDevice.EnMouse;
import main.enDevice.EnTouchpad;

public class EnDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
