import java.util.Scanner;

public class _1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salarioFixo, totalVendas, salarioFinal;
        nome = scanner.nextLine();
        salarioFixo = scanner.nextDouble();
        totalVendas = scanner.nextDouble();
        salarioFinal = salarioFixo + (totalVendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
        scanner.close();
    }
}
