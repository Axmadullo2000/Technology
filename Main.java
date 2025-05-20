import Techniques.Phone;
import Techniques.TV;
import Techniques.WashingMachine;

public class Main {
    public static void main(String[] args) {
        TV tvSet = new TV();

        tvSet.techniqueParams("Samsung", "Red", false);

        tvSet.setDisplayTechnology("OLED");
        tvSet.setDisplaySize(60);
//        tvSet.turnOn();

        tvSet.work();

        Phone phone = new Phone();
        phone.techniqueParams("Galaxy", "Gold", false);
        phone.setMobileOperator("UzMobile");
        phone.setMemory(64);

        phone.turnOn();
        phone.work();

        WashingMachine washingMachine = new WashingMachine();
        phone.techniqueParams("LG", "White", false);
        washingMachine.setSpinSpeed(1000);
        washingMachine.setWaterConsumption(50);
        washingMachine.setLoadingCapacity(10);

//        washingMachine.turnOn();
        washingMachine.work();
    }

}
