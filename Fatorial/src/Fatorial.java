import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para ver seu Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;

        }

        System.out.println("O fatorial é: " + multiplicacao);

    }
}
