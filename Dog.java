
public class Dog {
    String name;

    public static void main(String[] args){

        Dog dog1 = new Dog();
        dog1.bark(1);
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Arcane";
        myDogs[1].name = "Sora";

        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x<myDogs.length){
            myDogs[x].bark(1);
            x++;
        }
    }
    public void bark(int n){
        for(int x=0; x<n ; x++)
            System.out.println(name + " says woof!");
    }
    public void eat(){

    }
    public void chaseCat(){
        
    }
}
