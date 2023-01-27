public class App {
    public static void main(String[] args) throws Exception{
        
        Person Friend = new Person("Fredrick", 28);

        Myself Me = new Myself("Alfred", 19);

        Me.addFriend (Friend);

        Pet Dog = new Pet("Joebert", Friend);

        Dog.showOwnerName();

        Car SportCar = new Car("Bugatti", Me);

        SportCar.showBrandName();

    }
}
