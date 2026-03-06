import java.util.Scanner;

public class _1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B,MEDIA;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        MEDIA = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        scanner.close();
    }
}
