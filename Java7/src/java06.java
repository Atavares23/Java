import java.util.Scanner;

public class java06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Digite a operação desejada:\n" +
                           "1 - Adição\n" +
                           "2 - Subtração\n" +
                           "3 - Multiplicação\n" +
                           "4 - Divisão\n"); 
        
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("+ = Adição");
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println("- = Subtração");
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println("* = Multiplicação");
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println("/ = Divisão");
                System.out.println(num1 / num2);
                break;

            case 0:
                System.out.println("Operação Invalida");
                break;

        }
    }
}