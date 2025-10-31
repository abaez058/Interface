public class Burger implements FoodItem {
    private String name;
    private double price;
    private String description;


    public Burger() {
        this.name = "Burger";
        this.price = 9.99;
        this.description = "(Combo)";
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }
}
