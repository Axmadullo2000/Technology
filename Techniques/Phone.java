package Techniques;

import utilits.Techniques;

public class Phone extends Techniques {
    private String mobileOperator;
    private int memory;

    public void setMobileOperator(String mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    @Override
    public void work() {
        if (isStartWorking()) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Phone is working now!");
            System.out.printf("Mobile operator: %s\n", mobileOperator);
            System.out.printf("Memory: %d GB", memory);
            System.out.println("\n--------------------------------------------------------");

            super.work();
        }else {
            System.out.println("Phone is switched off!");
        }

    }
}
