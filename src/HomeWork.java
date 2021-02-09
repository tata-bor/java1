public class HomeWork {
    public static void initialize () {
        byte byteValue = -110;
        boolean booleanValue = true;
        short shortValue = 1123;
        long longValue = 100000L;
        int intValue = 45677;
        double doubleValue = 12.12;
        float floatValue = 10000f;
        char charValue = '*';
    }
    public static float CalcResult (float a, float b, float c, float d) {
        var result = a * (b + (c / d));
        return result;
    }
    }
}
