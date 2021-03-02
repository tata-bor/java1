package HomeWork6;

public abstract class Pet {

    public abstract void run(int runDistance);

    public abstract void swim(int swimDistance);

    public static int current;
    protected Pet (){
        current++;
        System.out.println("Добавлено 1 животное. Теперь животных " + current);
    }
}
