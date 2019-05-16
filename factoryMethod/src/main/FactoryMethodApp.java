package main;

public class FactoryMethodApp {
    public static void main(String[] args) {

        WatchMaker maker = getMakerByNane("Digital");

        Watch watch = maker.createWatch();
        watch.showtime();

    }

    public static WatchMaker getMakerByNane(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Rome")) {
            return new RomeWatchMaker();
        }

        throw new RuntimeException("Unsupported watch maker");
    }
}
