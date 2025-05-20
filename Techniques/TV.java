package Techniques;

import utilits.Techniques;

public class TV extends Techniques {
    private String displayTechnology;
    private int displaySize;

    @Override
    public void work() {
        if (super.isStartWorking()) {
            System.out.println("--------------------------------------------------------");
            System.out.println("TV is working now!");
            System.out.printf("Display Technology: %s, display size: %d", displayTechnology, displaySize);
            System.out.println("\n--------------------------------------------------------");
            super.work();
        }else {
            System.out.println("TV is switched off!");
        }
    }

    public TV() {
    }

    public void setDisplayTechnology(String displayTechnology) {
        this.displayTechnology = displayTechnology;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }
}
