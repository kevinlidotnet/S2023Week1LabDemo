public class Main {
    public static void main(String[] args) {

        FoodMenu foodMenu = new FoodMenu("Sweet Sour Chicken", 19.99, 0);

        System.out.println(foodMenu);
        foodMenu.setPrice(foodMenu.getPrice()*1.02);
        System.out.println("Price has been updated:");
        System.out.println(foodMenu);
        foodMenu.setSpicyLevel(foodMenu.getSpicyLevel()+1);
        System.out.println("Spicy Level has been increased:");
        System.out.println(foodMenu);

    }
}