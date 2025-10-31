public class Salad implements FoodItem {
    private String name;
    private double price;
    private String description;


    public Salad() {
        this.name = "Salad";
        this.price = 6.49;
        this.description = "(Caesar)";
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
