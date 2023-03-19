import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Digite a quantidade desejada de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            count++;

        } while (count < quantNumeros);

        System.out.println("A quantidade de números pares é: " + quantPares);
        System.out.println("A quantidade de números impares é: " + quantImpares);
    }
}
