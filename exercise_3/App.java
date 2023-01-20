public class App {
    public static void main(String [] args) {    
        Weapon Sword = new Weapon();

        Sword.name = "Sprikitik";
        Sword.damage = 75;
        Sword.rarity = "Legendary";
        Sword.addDamage(additionalDamage:5);

        System.out.print(Sword.showNameandRarity());

        Character Wizard = new Character();

        Wizard.name = "Scyte";
        Wizard.sayMyName();
        Wizard.attack();
        
    }

}
