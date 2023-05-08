public class FoodMenu {
    private String foodName;
    private double price;
    private int spicyLevel;

    public FoodMenu(String foodName, double price, int spicyLevel) {
        setFoodName(foodName);
        setPrice(price);
        setSpicyLevel(spicyLevel);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if(price >= 1 && price <= 100)
            this.price = price;
        else
            throw new IllegalArgumentException("price must from $1 to $100");
    }

    public int getSpicyLevel() {
        return spicyLevel;
    }

    public void setSpicyLevel(int spicyLevel) {
        if(spicyLevel>=0 && spicyLevel <=3)
            this.spicyLevel = spicyLevel;
        else
            throw new IllegalArgumentException("SpicyLevel must between 0 to 3");
    }

    @Override
    public String toString() {
        return "FoodMenu{" +
                " foodName = '" + foodName + '\'' +
                ", price = " + price +
                ", spicyLevel = " + spicyLevel +
                '}';
    }
}
