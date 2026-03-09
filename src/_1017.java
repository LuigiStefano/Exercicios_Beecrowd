import java.util.Scanner;

public class _1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();
        int distancia = tempo * velocidade;
        double litros = distancia / 12.0;
        System.out.printf("%.3f\n", litros);
        scanner.close();
    }
}
