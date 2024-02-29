public class Main {
    public static void main(String[] args) {
        Car car = new Car("2024 blue ferrari");
        runRace(car);

        Car ferrari = new GasPoweredCar("2023 blue saloon", 14.6,6);
        runRace(ferrari);

        Car telsa = new ElectricCar("2023 Tesla  ",568,75);
        runRace(telsa);

        Car toyota = new HybridCar("fielder 2023",16,8,8);
        runRace(toyota);

    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();

    }
}
