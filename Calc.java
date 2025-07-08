import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a, b;
        int choice;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Welcome to Scientific Calculator");
            System.out.println("1. Add     2. Sub     3. Mul     4. Div");
            System.out.println("5. Pow     6. Sqrt    7. 1/x     8. x^2");
            System.out.println("9. sin    10. cos    11. tan    12. log");
            System.out.println("13. ln    14. 10^x   15. e^x    16. Mod");
            System.out.println("17. abs   18. fact   0. Exit");

            do {
                System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result: " + calc.add(a, b));
                    }
                    case 2 -> {
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result: " + calc.subtract(a, b));
                    }
                    case 3 -> {
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result: " + calc.multiply(a, b));
                    }
                    case 4 -> {
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result: " + calc.divide(a, b));
                    }
                    case 5 -> {
                        System.out.print("Enter base and exponent: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result: " + calc.power(a, b));
                    }
                    case 6 -> {
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.sqrt(a));
                    }
                    case 7 -> {
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.inverse(a));
                    }
                    case 8 -> {
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.square(a));
                    }
                    case 9 -> {
                        System.out.print("Enter angle (°): ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.sin(a));
                    }
                    case 10 -> {
                        System.out.print("Enter angle (°): ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.cos(a));
                    }
                    case 11 -> {
                        System.out.print("Enter angle (°): ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.tan(a));
                    }
                    case 12 -> {
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.log10(a));
                    }
                    case 13 -> {
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.ln(a));
                    }
                    case 14 -> {
                        System.out.print("Enter exponent: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.tenPow(a));
                    }
                    case 15 -> {
                        System.out.print("Enter exponent: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.exp(a));
                    }
                    case 16 -> {
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result: " + calc.mod(a, b));
                    }
                    case 17 -> {
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.abs(a));
                    }
                    case 18 -> {
                        System.out.print("Enter integer: ");
                        int n = sc.nextInt();
                        System.out.println("Result: " + calc.factorial(n));
                    }
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice!");
                }

            } while (choice != 0);
        }
    }
}

