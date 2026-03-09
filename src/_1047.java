import java.util.Scanner;

public class _1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicio, minInicio, horaFim, minFim, horaTempo, minTempo, tempo;
        horaInicio = scanner.nextInt();
        minInicio = scanner.nextInt();
        horaFim = scanner.nextInt();
        minFim = scanner.nextInt();

        horaInicio *= 60;
        horaFim *= 60;


        if ((horaFim + minFim)> (horaInicio + minInicio)){
             tempo = (horaFim + minFim) - (horaInicio + minInicio);
        } else {
            tempo = (1440 - (horaInicio + minInicio)) + (horaFim + minFim) ;
        }


            horaTempo = tempo / 60;
            minTempo = tempo % 60;
            System.out.println("O JOGO DUROU " + horaTempo + " HORA(S) E " + minTempo + " MINUTO(S)");
            scanner.close();
        }


    }

