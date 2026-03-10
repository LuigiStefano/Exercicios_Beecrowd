import java.util.Scanner;

public class _1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = scanner.nextDouble();
        double num =  total * 100;
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", ((int)num / 10000));
        num = num % 10000;
        System.out.printf("%d nota(s) de R$ 50.00\n", (int)num / 5000);
        num = num % 5000;
        System.out.printf("%d nota(s) de R$ 20.00\n", (int)num / 2000);
        num = num % 2000;
        System.out.printf("%d nota(s) de R$ 10.00\n", (int)num / 1000);
        num = num % 1000;
        System.out.printf("%d nota(s) de R$ 5.00\n",  (int)num / 500);
        num = num % 500;
        System.out.printf("%d nota(s) de R$ 2.00\n", (int)num / 200);

        System.out.println("MOEDAS:");
        num = num % 200;
        System.out.printf("%d moeda(s) de R$ 1.00\n", (int)num / 100);
        num = num % 100;
        System.out.printf("%d moeda(s) de R$ 0.50\n", (int)num / 50);
        num = num % 50;
        System.out.printf("%d moeda(s) de R$ 0.25\n", (int)num / 25);
        num = num % 25;
        System.out.printf("%d moeda(s) de R$ 0.10\n", (int)num / 10);
        num = num % 10;
        System.out.printf("%d moeda(s) de R$ 0.05\n", (int)num / 5);
        num = num % 5;
        System.out.printf("%d moeda(s) de R$ 0.01\n", (int)num);
        scanner.close();
    }
}
