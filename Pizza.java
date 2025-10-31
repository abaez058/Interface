public class Pizza implements FoodItem {
    private String name;
    private double price;
    private String description;


    public Pizza() {
        this.name = "Pizza";
        this.price = 12.99;
        this.description = "(Large)";
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
