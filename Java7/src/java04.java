import java.util.Scanner;

public class java04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int inteirovalor = scanner.nextInt();

        String tipo; // declaração da variável

        if (inteirovalor > 0) {
            tipo = "P";
        } 
        else if (inteirovalor < 0) {
            tipo = "N";
        } 
        else {
            tipo = "Z";
        }

        switch (tipo) {
            case "P":
                System.out.println("Positivo");
                break;
            case "N":
                System.out.println("Negativo");
                break;
            case "Z":
                System.out.println("Zero");
                break;
        }
    }
}
