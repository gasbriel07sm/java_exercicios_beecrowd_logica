import java.util.Locale;
import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        int nota = 0;

        System.out.println("NOTAS: ");
        nota = 100;
        System.out.println((int) valor / nota + " nota (s) de R$ 100.00");
        valor %= nota;

        nota = 50;
        System.out.println((int) valor / nota + " nota (s) de R$ 50.00");
        valor %= nota;

        nota = 20;
        System.out.println((int) valor / nota + " nota (s) de R$ 20.00");
        valor %= nota;

        nota = 10;
        System.out.println((int) valor / nota + " nota (s) de R$ 10.00");
        valor %= nota;

        nota = 5;
        System.out.println((int) valor / nota + " nota (s) de R$ 5.00");
        valor %= nota;

        nota = 2;
        System.out.println((int) valor / nota + " nota (s) de R$ 2.00");
        valor %= nota;

        int moedas = 0;
        valor *= 100;

        System.out.println("MOEDAS: ");

        moedas = 100;
        System.out.println((int) valor / moedas + " moeda (s) de R$ 1.00");
        valor %= moedas;

        moedas = 50;
        System.out.println((int) valor / moedas + " moeda (s) de R$ 0.50");
        valor %= moedas;

        moedas = 25;
        System.out.println((int) valor / moedas + " moeda (s) de R$ 0.25");
        valor %= moedas;

        moedas = 10;
        System.out.println((int) valor / moedas + " moeda (s) de R$ 0.10");
        valor %= moedas;

        moedas = 5;
        System.out.println((int) valor / moedas + " moeda (s) de R$ 0.05");
        valor %= moedas;

        moedas = 1;
        System.out.println((int) valor / moedas + " moeda (s) de R$ 0.01");
        valor %= moedas;

        sc.close();
    }
}
