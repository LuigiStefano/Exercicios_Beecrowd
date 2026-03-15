import java.util.Scanner;

public class _1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a+b > c  && b + c > a && c + a > b){
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
        scanner.close();
    }

}
