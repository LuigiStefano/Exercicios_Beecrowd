import java.util.Scanner;

public class _1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod1, num1, cod2, num2;
        double valor1, valor2, total;
        cod1 = scanner.nextInt();
        num1 = scanner.nextInt();
        valor1 = scanner.nextDouble();
        cod2 = scanner.nextInt();
        num2 = scanner.nextInt();
        valor2 = scanner.nextDouble();
        total = (num1 * valor1) + (num2*valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        scanner.close();
    }
}
