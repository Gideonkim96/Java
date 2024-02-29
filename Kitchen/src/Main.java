public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
//        kitchen.getDishWasher().setHasWorkTodo(true);
//        kitchen.getIceBox().setHasWorkTodo(true);
//        kitchen.getBrewMaster().setHasWorkTodo(true);
//
//        kitchen.getDishWasher().dishWash();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();
    }
}
