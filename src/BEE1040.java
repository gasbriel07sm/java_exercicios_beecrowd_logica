import java.util.Locale;
import java.util.Scanner;

public class BEE1040 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4)/10.0;
        System.out.printf("Média: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0) {
            System.out.println("Aluno reprovado");
        }
        else if (media >= 5.0 && media < 7.0) {
            System.out.println("Aluno em exame");
            System.out.print("Nota do exame: ");
            double notaExame = sc.nextDouble();

            media = (media + notaExame)/2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado");
            }
            else {
                System.out.println("Aluno reprovado");
            }

            System.out.printf("Média final: %.1f%n", media);
        }

        sc.close();
    }
}
