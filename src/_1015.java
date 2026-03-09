import java.util.Scanner;

public class _1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p1x, p1y, p2x, p2y, distancia;
        p1x = scanner.nextDouble();
        p1y = scanner.nextDouble();
        p2x = scanner.nextDouble();
        p2y = scanner.nextDouble();
        distancia = ((p2x - p1x)*(p2x - p1x)) + ((p2y - p1y)*(p2y - p1y));
        distancia = Math.sqrt(distancia);
        System.out.printf("%.4f\n", distancia);
        scanner.close();
    }
}
