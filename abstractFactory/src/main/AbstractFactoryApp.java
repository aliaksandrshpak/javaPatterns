package main;

import main.factory.EnDeviceFactory;
import main.factory.RuDeviceFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {

    }

    private static DeviceFactory getFactoryByCountryCode(String lang) {
        switch (lang) {
            case "RU" : return new RuDeviceFactory();
            case "EN" : return new EnDeviceFactory();
            default: throw  new RuntimeException("Unsupported country code " + lang);
        }
    }
}
