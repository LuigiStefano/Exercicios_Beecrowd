import java.util.Scanner;

public class _1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B,C;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n",(A * C) / 2.0);
        System.out.printf("CIRCULO: %.3f\n",(3.14159 * C * C));
        System.out.printf("TRAPEZIO: %.3f\n",((A + B) * C) / 2.0);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);
        scanner.close();
    }
}
