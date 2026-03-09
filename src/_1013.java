import java.util.Scanner;

import static java.lang.Math.abs;

public class _1013 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int maior = ((a+b)+ abs(a-b)) /2;
        if (maior > c){
            System.out.println(maior + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }
        scanner.close();
    }
}
