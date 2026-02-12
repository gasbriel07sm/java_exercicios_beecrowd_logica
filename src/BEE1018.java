import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        System.out.println(valor);

        int nota = 0;

        nota = 100;
        System.out.println(valor / nota + " nota (s) de R$ 100,00");
        valor %= nota;

        nota = 50;
        System.out.println(valor / nota + " nota (s) de R$ 50,00");
        valor %= nota;

        nota = 20;
        System.out.println(valor / nota + " nota (s) de R$ 20,00");
        valor %= nota;

        nota = 10;
        System.out.println(valor / nota + " nota (s) de R$ 10,00");
        valor %= nota;

        nota = 5;
        System.out.println(valor / nota + " nota (s) de R$ 5,00");
        valor %= nota;

        nota = 2;
        System.out.println(valor / nota + " nota (s) de R$ 2,00");
        valor %= nota;

        nota = 1;
        System.out.println(valor / nota + " nota (s) de R$ 1,00");
        valor %= nota;

        sc.close();
    }
}
