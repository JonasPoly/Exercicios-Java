import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("O Maior número é: " + maior);
        System.out.println("A Média dos números é: " + (soma / 5));
    }
}
