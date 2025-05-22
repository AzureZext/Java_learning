package Java_learning;
class Dog{
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Bhaw Bhaw...");
    }
}

public class Dogtest{
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.size = 50;
        myDog.name = "azure";
        myDog.breed = "siberian husky";

        myDog.bark();
        System.out.println(myDog.name);
    }
}
