package main;

public class CDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void load() {
        data = true;
    }

    public void unload() {
        data = false;
    }
}
