package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food < n) {
            System.out.println("Недостаточно еды в тарелке");
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void giveFood(int n) {
        food += n;
    }
}
