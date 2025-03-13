import java.util.Scanner;

public class Exemplodescanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Entao seu nome e: " + nome);
        System.out.println("Entao voce tem: " + idade);

        scanner.close();
    }
}
