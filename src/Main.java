import Assignment3.Animal.Animal;
import Assignment3.Animal.Dog;

public class Main {
    public static void main( String[] args ) {
        // accessing the public class
        Animal animal = new Animal("Cat", false, "milk", 4);

        // accessing the private variable
        //animal.noOfLegs = 4; We can not access this because this is private variable in Animal class

        animal.name = "Elephant";

        // accessing the public method
        System.out.println("Number of legs of Cat: " + animal.getNoOfLegs());
        System.out.println("Name of your animal: " + animal.name);

        Dog dog = new Dog("Roy", false, "meat", 4);
        // System.out.println(dog.getNickName());  Here we can not call getNickName() method because this is private method

        System.out.println("Number of legs of " + dog.getName() +": " + dog.getNoOfLegs());
        System.out.println("Name of your animal: " + animal.name);

    }
}
