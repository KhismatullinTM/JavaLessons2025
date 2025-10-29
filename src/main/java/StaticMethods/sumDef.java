package StaticMethods;

public class sumDef {
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void div(int a, int b) {
        int quotient = a / b;   // целое частное
        int remainder = a % b;  // остаток
        System.out.println("Частное: " + quotient + ", Остаток: " + remainder);
    }

    final static double p = 3.14;

    public double square (double r){
        double radiusResult = r * r;
        return radiusResult * p;
    }

    public static double length (double r){
         double lengthKrug = 2 * r * p;
         return lengthKrug;
    }
    public void results (double r) {
        System.out.println("Значение радиуса круга: " + square(r));
        System.out.println("Значение длины круга: " + length(r));
    }
}
