import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a tabuada desejada: ");
        int tabuada = scan.nextInt();

        System.out.println("A tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "x" + i + " = " + (tabuada * i));

        }
    }
}
