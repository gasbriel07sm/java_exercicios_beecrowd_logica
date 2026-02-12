import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();

        int horas = tempo / 3600;
        tempo %= 3600;
        int minutos = tempo / 60;
        tempo %= 60;
        int segundos = tempo;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        sc.close();
    }
}
