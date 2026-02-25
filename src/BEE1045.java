import java.util.Locale;
import java.util.Scanner;

public class BEE1045 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double maior = 0;
        double menor = 0;
        double meio =  0;

        if (A > B && A > C) {
            maior = A;
            if (B > C) {
                meio = B;
                menor = C;
            } else {
                meio = C;
                menor = B;
            }
        }
        else if (B > A && B > C) {
            maior = B;
            if (A > C) {
                meio = A;
                menor = C;
            } else {
                meio = C;
                menor = A;
            }
        }
        else {
            maior = C;
            if (A > B) {
                meio = A;
                menor = B;
            } else {
                meio = B;
                menor = A;
            }
        }
        A = maior;
        B = meio;
        C = menor;

        if (A >= B + C) {
            System.out.println("NÃO FORMA TRIÂNGULO");
        }
        else if (A * A  == B * B + C * C) {
            System.out.println("TRIÂNGULO RETÂNGULO");
        }
        else if (A * A > B * B + C * C) {
            System.out.println("TRIÂNGULO OBTUSÂNGULO");
        }
        else if (A * A < B * B + C * C) {
            System.out.println("TRIÂNGULO ACUTÂNGULO");
        }

        if (A == B && A == C) {
            System.out.println("TRIÂNGULO EQUILÁTERO");
        }
        else if (A == B || B == C || C == A) {
            System.out.println("TRIÂNGULO ISÓCELES");
        }

        sc.close();
    }
}
