public class Main{
    public static void main(String[] args) {

        FoodItem pizza = new Pizza();
        FoodItem burger = new Burger();
        FoodItem salad = new Salad();


        FoodOrder order = new FoodOrder();


        order.addItem(pizza);
        order.addItem(burger);
        order.addItem(salad);


        order.displayOrderDetails();
    }
}
