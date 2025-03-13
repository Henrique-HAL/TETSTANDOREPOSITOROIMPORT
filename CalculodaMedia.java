import java.util.Scanner;

public class CalculodaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        String imput= scanner.nextLine();
        int num1= Integer.parseInt(imput);

        System.out.println("Digite o sugundo numero:");
        String imput2= scanner.nextLine();
        int num2= Integer.parseInt(imput2);

        System.out.println("Digite o Terceiro numero:");
        String imput3= scanner.nextLine();
        int num3= Integer.parseInt(imput3);

        double Mediaaritmitca=(num1 + num2 + num3) / 3;
        System.out.println("A medida Aritimatica dos numeros e:" + Mediaaritmitca);

        scanner.close();


    }
}
