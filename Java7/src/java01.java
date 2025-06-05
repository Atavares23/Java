import java.util.Scanner;

public class java01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();


        int faixa;

        if ( idade >= 0 && idade <= 12 ) {
            faixa = 1;
        }
        else if ( idade >= 13 && idade <=17 ) {
            faixa = 2;
        }
        else if ( idade  <= 59) {
            faixa = 3;
        }
        else if ( idade >= 60 ) {
            faixa = 4;
        }
        else {
            faixa = 0;
        }

        switch (faixa) {
            case 1:
                System.out.println("Vc é uma CRIANÇA.");
                break;

            case 2:
                System.out.println("Vc é uma ADOLECENTE.");
                break;

            case 3:
                System.out.println("Vc é uma ADULTO.");
                break;

            case 4:
                System.out.println("Vc é uma IDOSO.");
                break;

            case 5:
                System.out.println("Turno Invalido.");
                break;
            default:
                System.out.println("Fim");
        }


    }
}