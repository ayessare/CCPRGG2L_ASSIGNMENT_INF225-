public class Character {
    int damage;
    String rarity;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    
    public void sayMyrarity() {
        System.out.println("My Rarity is " + rarity);
    }
    public void attack() {
        System.out.println("I am attacking");
    }
}