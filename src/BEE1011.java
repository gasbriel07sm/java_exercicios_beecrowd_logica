import java.util.Locale;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;
        double raio = sc.nextDouble();
        double VOLUME = (4/3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", VOLUME);

       sc.close();
    }
}
