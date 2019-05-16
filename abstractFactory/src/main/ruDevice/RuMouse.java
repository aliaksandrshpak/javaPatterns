package main.ruDevice;

import main.device.Mouse;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }

    @Override
    public void doubleClick() {
        System.out.println("Двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Скролл вверх");
        } else if (direction < 0) {
            System.out.println("Скролл вниз");
        } else {
            System.out.println("Не скроллим");
        }
    }
}
