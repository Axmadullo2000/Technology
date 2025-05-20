package utilits;

public class Techniques {
    private String model;
    private String color;
    private boolean startWorking = false;

    public void techniqueParams(String model, String color, boolean startWorking) {
        this.model = model;
        this.color = color;
        this.startWorking = startWorking;
    }

    public boolean isStartWorking() {
        return startWorking;
    }

    public Techniques() {
    }

    public void work() {
        System.out.println("Technique: ");

        System.out.printf("Model: %s, Color: %s", model, color);
        System.out.println("\n--------------------------------------------------------");
    }

    public void turnOn() {
        this.startWorking = true;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStartWorking(boolean startWorking) {
        this.startWorking = startWorking;
    }

    public void turnOff() {
        startWorking = false;
    }

}
