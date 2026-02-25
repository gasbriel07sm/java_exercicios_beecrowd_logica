import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String res1 = sc.nextLine();
        String res2 = sc.nextLine();
        String res3 = sc.nextLine();

        if (res1.equals("vertebrado")) {
            if (res2.equals("ave")) {
                if (res3.equals("onivoro")) {
                    System.out.println("AGUIA");
                }
                else if (res3.equals("carnivoro")) {
                    System.out.println("POMBA");
                }
            }
            else if (res2.equals("mamifero")) {
                if (res3.equals("onivoro")) {
                    System.out.println("HOMEM");
                }
                else if (res3.equals("herbivoro")) {
                    System.out.println("VACA");
                }
            }
        }
        else if (res1.equals("invertebrado")){
            if (res2.equals("inseto")) {
                if (res3.equals("hematofogo")) {
                    System.out.println("PULGA");
                }
                else if (res3.equals("herbivoro")) {
                    System.out.println("LARGARTA");
                }
            }
            else if (res2.equals("anelideo")) {
                if (res3.equals("hematofogo")) {
                    System.out.println("SANGUESSUGA");
                }
                else if (res3.equals("onivoro")) {
                    System.out.println("MINHOCA");
                }
            }
        }
        sc.close();
    }
}
