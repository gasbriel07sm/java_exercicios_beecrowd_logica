import java.util.Scanner;

public class BEE1050 {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ddd = sc.nextInt();

        switch (ddd) {
           case 61:
                System.out.println("BRASÍLIA");
                break;
            case 71:
                System.out.println("SALVADOR");
                break;
            case 11:
                System.out.println("SAO PAULO");
                break;
            case 21:
                System.out.println("RIO DE JANEIRO");
                break;
            case 32:
                System.out.println("JUIZ DE FORA");
                break;
            case 19:
                System.out.println("CAMPINAS");
                break;
            case 27:
                System.out.println("VITORIA");
                break;
            case 31:
                System.out.println("BELO HORIZONTE");
                break;
            default:
                System.out.println("NÃO CADASTRADO");
                break;
        }
        sc.close();
    }
}
