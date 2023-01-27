public class Car {
    String name;
    Myself owner;

    Car(String carName, Myself ownerName){
        this.name = carName;
        this.owner = ownerName;
    }

    void showBrandName(){
        System.out.println("This car is " + this.name + ", and the owner name is " + owner.name);
     }
}
