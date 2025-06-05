import java.util.Scanner;

public class java05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Opção desejada:\n" +
                           "1 - RG\n" +
                           "2 - CPF\n" +
                           "3 - CNH\n" +
                           "4 - Passaporte\n" +
                           "0 - Sair");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("RG");
                break;

            case 2:
                System.out.println("CPF");
                break;

            case 3:
                System.out.println("CNH");
                break;

            case 4:
                System.out.println("Passaporte");
                break;

            case 0:
                System.out.println("SAIR");
                break;

        }
    }
}