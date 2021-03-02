package HomeWork6;

public class Dog extends Pet {
    public final int runLimit = 500;
    public final int swimLimit = 10;


    @Override
    public void run(int runDistance) {
        if (runDistance <= runLimit) {
            System.out.println("Собака пробежала " + runDistance + " м" + "\n");
        } else {
            System.out.println("Собаки не бегают на такие дистанции \n");
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= swimLimit) {
            System.out.println("Собака проплыла " + swimDistance + " м" + "\n");
        } else {
            System.out.println("Собаки не плавают на такие дистанции \n");
        }
    }
}
