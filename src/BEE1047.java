import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int totalInicio = horaInicial * 60 + minutoInicial;
        int totalFinal = horaFinal * 60 + minutoFinal;
        int total = 0;

        if (horaFinal < horaInicial) {
            total = (1440 - totalInicio) + totalFinal;
        }
        else if (horaFinal > horaInicial){
            total = totalFinal - totalInicio;
        }
        else {
            total = 1440;
        }

        int totalHoras = (total / 60);
        int totalMinutos = (total % 60);

        System.out.println("O JOGO DUROU " + totalHoras + " HORA (S) E " + totalMinutos + " MINUTO (S)");

        sc.close();
    }
}
