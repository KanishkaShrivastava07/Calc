public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return (b != 0) ? a / b : Double.NaN;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double inverse(double a) {
        return (a != 0) ? 1 / a : Double.NaN;
    }

    public double square(double a) {
        return a * a;
    }

    public double sin(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public double cos(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public double tan(double degrees) {
        return Math.tan(Math.toRadians(degrees));
    }

    public double log10(double a) {
        return Math.log10(a);
    }

    public double ln(double a) {
        return Math.log(a);
    }

    public double tenPow(double a) {
        return Math.pow(10, a);
    }

    public double exp(double a) {
        return Math.exp(a);
    }

    public double mod(double a, double b) {
        return a % b;
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    public long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
