public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("Regular","coke","fries");
    }

    public MealOrder( String burgerType, String drinkType, String sideType){
        this.burger = new Burger(burgerType, 400);
        this.drink = new Item(drinkType,"drink", 100);
        this.side = new Item(sideType, "side", 150);
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public  void printItemizedList(){

        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(40));
        Item.printItem("TOTAL PRICE",getTotalPrice());

    }
}
