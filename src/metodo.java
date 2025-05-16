import java.util.Scanner;

public class metodo {
    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Método de Bisección para encontrar raíces de f(x) = x^3 - x - 2");

        System.out.print("Ingrese el límite inferior a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el límite superior b: ");
        double b = scanner.nextDouble();

        if (f(a) * f(b) >= 0) {
            System.out.println("Error: f(a) y f(b) deben tener signos opuestos.");
            scanner.close();
            return;
        }

        System.out.print("Ingrese la tolerancia (ej. 0.0001): ");
        double tol = scanner.nextDouble();

        System.out.print("Ingrese el número máximo de iteraciones: ");
        int maxIter = scanner.nextInt();

        double c = a;
        int iter = 0;

        System.out.println("\nIter\t a\t\t b\t\t c\t\t f(c)");

        for (; b - a >= tol && iter < maxIter; iter++) {
            c = (a + b) / 2.0;
            double fc = f(c);
            System.out.printf("%d\t %.6f\t %.6f\t %.6f\t %.6f\n", iter, a, b, c, fc);

            if (f(a) * fc < 0) {
                b = c;
            } else {
                a = c;
            }
        }

        System.out.printf("\nAproximación de la raíz: %.6f\n", c);
        System.out.println("Iteraciones realizadas: " + iter);

        scanner.close();
    }
}
