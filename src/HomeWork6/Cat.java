package HomeWork6;

public class Cat extends Pet {
    public final int runLimit = 200;

    @Override
    public void run(int runDistance) {
        if (runDistance <= runLimit) {
            System.out.println("Кот пробежал " + runDistance + " м" + "\n");
        } else {
            System.out.println("Коты не бегают на такие дистанции \n");
        }
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Коты не умеют плавать! \n");
    }
}
