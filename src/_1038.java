import java.util.Scanner;

public class _1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int quant = scanner.nextInt();
        double total = 0;

        switch (codigo){
            case 1:
                total = quant * 4.00;
                break;
            case 2:
                total = quant * 4.50;
                break;
            case 3:
                total = quant * 5.00;
                break;
            case 4:
                total = quant * 2.00;
                break;
            case 5:
                total = quant * 1.50;
                break;
            default:
                break;
        }
        System.out.printf("Total: R$ %.2f\n", total);
        scanner.close();
    }
}
