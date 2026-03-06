import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas,numero;
        float valorHora;
        numero = scanner.nextInt();
        horas = scanner.nextInt();
        valorHora = scanner.nextFloat();
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", (horas*valorHora));

        scanner.close();
    }
}
