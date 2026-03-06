import java.util.Scanner;

public class _1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B,C,MEDIA;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        MEDIA = (A * 2 + B * 3 + C * 5)/10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
        scanner.close();
    }
}
