public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");

        Monitor theMonitor = new Monitor("27 Inch", "Acer", 27, "2240 x 1440");

        Motherboard theMotherboard = new Motherboard("Bj-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor,theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("MacOS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
