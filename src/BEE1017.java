import java.util.Locale;
import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        int distanciaTotal = velocidadeMedia * tempo;
        double litros = distanciaTotal / 12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();
    }
}
