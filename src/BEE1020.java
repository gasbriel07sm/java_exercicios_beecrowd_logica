import java.util.Scanner;

public class BEE1020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int anos = idade / 365;
        idade %= 365;
        int meses = idade / 30;
        idade %= 30;
        int dias = idade;

        System.out.println(anos + " ano (s)");
        System.out.println(meses + " mes (s)");
        System.out.println(dias + " dia (s)");

        sc.close();
    }
}
