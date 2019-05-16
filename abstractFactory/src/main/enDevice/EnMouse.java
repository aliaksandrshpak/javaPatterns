package main.enDevice;

import main.device.Mouse;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Click mouse");
    }

    @Override
    public void doubleClick() {
        System.out.println("Double click mouse");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Scroll up");
        } else if (direction < 0) {
            System.out.println("Scroll down");
        } else {
            System.out.println("No scrolling");
        }
    }
}
