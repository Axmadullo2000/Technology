package Techniques;

import utilits.Techniques;

public class WashingMachine extends Techniques {
    private int spinSpeed;
    private int  waterConsumption;
    private int loadingCapacity;

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    @Override
    public void work() {
        if (isStartWorking()) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Washing machine is ready to work!");
            System.out.printf("Spin speed: %s (turnover/minute) \n", spinSpeed);
            System.out.printf("Water consumption: %d litre per cycle\n", waterConsumption);
            System.out.printf("Loading capacity: %d kg linen", loadingCapacity);
            System.out.println("\n--------------------------------------------------------");

            super.work();
        }else {
            System.out.println("Washing machine is switched off!");
        }
    }

}
