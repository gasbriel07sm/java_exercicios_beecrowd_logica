import java.util.Locale;
import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaTotal = sc.nextInt();
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distanciaTotal / combustivelGasto;

        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}
