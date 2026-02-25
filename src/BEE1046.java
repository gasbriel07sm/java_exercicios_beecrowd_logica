import java.util.Scanner;

public class BEE1046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int total = 0;

        if (horaFinal < horaInicio) {
            total = (24 - horaInicio) + horaFinal;
        }
        else {
            total = horaFinal - horaInicio;
        }

        System.out.println("O JOGO DUROU " + total + " HORA (S)");

        sc.close();
    }
}
