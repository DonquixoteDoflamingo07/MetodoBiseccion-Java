import java.util.Scanner;

public class metodo {
    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metodo de Biseccion para encontrar raices de f(x) = x^3 - x - 2");
        System.out.print("Ingrese el limite inferior a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el limite superior b: ");
        double b = scanner.nextDouble();

        if (f(a) * f(b) >= 0) {
            System.out.println("Error: f(a) y f(b) deben tener signos opuestos.");
        } else {
            System.out.println("Los limites son validos.");
        }
        scanner.close();
    }
}
