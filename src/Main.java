import HomeWork7.Cat;
import HomeWork7.Plate;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
    }

