import java.util.Locale;
import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double total = 0;

        if (cod == 1) {
            total = 4.0 * qtd;
        }
        else if (cod == 2) {
            total = 4.5 * qtd;
        }
        else if (cod == 3) {
            total = 5.0 * qtd;
        }
        else if (cod == 4) {
            total = 2.0 * qtd;
        }
         else if (cod == 5) {
            total = 1.5 * qtd;
        }
         else {
            System.out.println("Código não cadastrado");
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
