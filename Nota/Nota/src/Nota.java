import java.util.Scanner;

public class Nota {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente");
            nota = scan.nextInt();

        }

    }
}
