public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkTodo(coffeeFlag);
        iceBox.setHasWorkTodo(fridgeFlag);
        dishWasher.setHasWorkTodo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.dishWash();
    }

}

class CoffeeMaker{
    private  boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public  void brewCoffee(){
        if (hasWorkTodo){
            System.out.println("Brewing Coffee");
            hasWorkTodo = false;
        }
    }
}

class Refrigerator{
    private  boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public  void orderFood(){
        if (hasWorkTodo){
            System.out.println("Ordering food");
            hasWorkTodo = false;
        }
    }
}

class DishWasher{
    private  boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public  void dishWash(){
        if (hasWorkTodo){
            System.out.println("Washing dishes");
            hasWorkTodo = false;
        }
    }
}


