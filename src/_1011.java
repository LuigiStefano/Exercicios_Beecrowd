import java.util.Scanner;

public class _1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double raio = scanner.nextDouble();
        double volume = (4.0/3) * pi * (raio * raio * raio);
        System.out.printf("VOLUME = %.3f\n", volume);
        scanner.close();
    }
}
