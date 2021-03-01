public class HomeWork {
    public static void initialize() {
        byte byteValue = -110;
        boolean booleanValue = true;
        short shortValue = 1123;
        long longValue = 100000L;
        int intValue = 45677;
        double doubleValue = 12.12;
        float floatValue = 10000f;
        char charValue = '*';
    }

    public static float CalcResult1(float a, float b, float c, float d) {
        var result = a * (b + (c / d));
        return result;
    }

    public static boolean CalcResult2(int a, int b) {
        var sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void CalcResult3(int a) {
        if (a >= 0) {
            System.out.println("Вы передали положительное число");
        } else {
            System.out.println("Вы передали отрицательное число");
        }
    }

    public static boolean CalcResult4(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void Hello(String name) {
        System.out.println("Привет, " + name);

    }

    public static void whatYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else if (year % 100 == 0) {
            System.out.println(year + " - невисокосный год.");
        } else if (year % 4 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - невисокосный год.");
        }
    }
}