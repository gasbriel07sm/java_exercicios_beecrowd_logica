import java.util.Locale;
import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTriangulo = (A * C) / 2.0;
        System.out.printf("TRIANGULO = %.3f%n", areaTriangulo);

        double areaCirculo = PI * C * C;
        System.out.printf("CIRCULO = %.3f%n", areaCirculo);

        double areaTrapezio = ((A + B) * C) / 2.0;
        System.out.printf("TRAPEZIO = %.3f%n", areaTrapezio);

        double areaQuadrado = B * B;
        System.out.printf("QUADRADO = %.3f%n", areaQuadrado);

        double areaRetangulo = A *B;
        System.out.printf("RETANGULO = %.3f%n", areaRetangulo);

        sc.close();
    }
}
