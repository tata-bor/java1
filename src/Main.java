import HomeWork7.Cat;
import HomeWork7.Plate;

public class Main {
    public static void main(String[] args) {
        /* Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        cat.eat(plate);
        plate.info(); */

        Plate plate = new Plate(50);
        plate.info();
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Tom", 10);
        catArray[1] = new Cat("Jerry", 5);
        catArray[2] = new Cat("Matilda", 12);
        catArray[3] = new Cat("Boris", 6);
        catArray[4] = new Cat("Vasil", 8);

        for (int i = 0; i < 5; i++) {
            catArray[i].eat(plate);
            catArray[i].print();
        }
        plate.info();
        plate.giveFood(20);
        plate.info();
    }
}

