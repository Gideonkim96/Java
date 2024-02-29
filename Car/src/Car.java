public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Car -> startEngine");
    }
    protected void runEngine(){
        System.out.println("Car is run Engine");
    }
    public void drive(){
        System.out.println("Car is driving type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLiter;
    private int cylinder = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinder are fired up, ready %n", cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas used exceeds the average: %.2f %n", avgKmPerLiter);
    }

}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kwh battery on , Ready %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV usage under average : %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{

    private double avgKmPerLiter;
    private int cylinder = 6;

    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinder, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinder = cylinder;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinder are fired up, ready %n", cylinder);
        System.out.printf("Hybrid -> switch %d kwh battery on , Ready %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid used below the average: %.2f %n", avgKmPerLiter);
    }

}



