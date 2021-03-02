import HomeWork6.Cat;
import HomeWork6.Dog;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.run (400);
        myDog.swim(500);
        myCat.run(200);
        myCat.swim(100);
    }
}

