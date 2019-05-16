package main;

public class Computer {
    private Power power = new Power();
    private CDRom cd = new CDRom();
    private HDD hdd = new HDD();

    public void copy() {
        power.on();
        cd.load();
        hdd.copyFromCD(cd);
    }
}
