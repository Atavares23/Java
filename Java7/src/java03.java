import java.sql.SQLOutput;
import java.util.Scanner;

public class java03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua Saudação: Bom dia, Boa tarde ou Boa noite");
        String turno = scanner.nextLine();

        String sturno = turno.trim().toLowerCase();

        if (sturno.equalsIgnoreCase("Bom dia")) {
            sturno = "dia";
        } 
        else if (sturno.equalsIgnoreCase("Boa tarde")) {
            sturno = "tarde";
        } 
        else if (sturno.equalsIgnoreCase("Boa noite")) {
            sturno = "noite";
        } 
        else {
            System.out.println("Saudação inválida");
            return;   
        }

        switch (sturno) {
            case "dia":
                System.out.println("Matutino");
                break;

            case "tarde":
                System.out.println("Vespertino");
                break;

            case "noite":
                System.out.println("Noturno");
                break;

        }
    }
}
