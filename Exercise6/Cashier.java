public class Cashier {
    public void checkOut(GroceryItem item){
        System.out.println("You have bought " + item.name);
    }
    public void showPrice (GroceryItem item){
        System.out.println("This is worth " + item.price);
    }
}
