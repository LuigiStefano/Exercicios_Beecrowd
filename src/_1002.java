import java.util.Scanner;
public class _1002 {
    public static void main(String[] args) {
        double raio, area;
        double n = 3.14159;
        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        area = n * raio*raio;
        System.out.printf("A=%.4f\n", area);
    }
}
