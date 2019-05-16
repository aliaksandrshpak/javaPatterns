package main;

public class HDD {
    public void copyFromCD(CDRom cd) {
        if (cd.hasData()) {
            System.out.println("Copying data");
        } else {
            System.out.println("Please, enter cd");
        }
    }
}
