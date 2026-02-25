import java.util.Locale;
import java.util.Scanner;

public class BEE1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double percentual = 0;
        double novoSalario = 0;
        double reajuste;

        if (salario >= 0 && salario <= 400) {
            percentual = 15;
            novoSalario += (salario * (percentual/100 + 1));
            reajuste = novoSalario - salario;
        }
        else if (salario > 400 && salario <= 800) {
            percentual = 12;
            novoSalario += (salario * (percentual/100 + 1));
            reajuste = novoSalario - salario;
        }
        else if (salario > 800 && salario <= 1200) {
            percentual = 10;
            novoSalario += (salario * (percentual/100 + 1));
            reajuste = novoSalario - salario;
        }
        else if (salario > 1200 && salario <= 2000) {
            percentual = 7;
            novoSalario += (salario * (percentual/100 + 1));
            reajuste = novoSalario - salario;
        }
        else {
            percentual = 4;
            novoSalario += (salario * (percentual/100 + 1));
            reajuste = novoSalario - salario;
        }

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Percentual: %.1f%%%n", percentual);

        sc.close();
    }
}
