import java.util.Scanner;

public class _1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();
        float media = ((n1*2) + (n2*3) + (n3*4) + (n4)) / 10;
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7){
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno em exame.");
            float notaExame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
             media =  (media + notaExame) / 2;
             if (media>= 5){
                 System.out.println("Aluno aprovado.");
                 System.out.printf("Media final: %.1f\n", media);
             } else {
                 System.out.println("Aluno reprovado.");
                 System.out.printf("Media final: %.1f\n", media);
             }
        } else {
            System.out.println("Aluno reprovado.");
        }


        scanner.close();
    }
}
