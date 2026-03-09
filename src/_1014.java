import java.util.Scanner;

public class _1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        float combustivel = scanner.nextFloat();
        System.out.printf("%.3f km/l\n", distancia / combustivel);
        scanner.close();
    }
}
