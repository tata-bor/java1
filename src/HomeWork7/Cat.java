package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        boolean catEat = p.decreaseFood(appetite);
        if (catEat) {
            satiety = true;
        }
        System.out.println("Сытость кота = " + satiety);
    }

    public void print() {
        if (satiety) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}


