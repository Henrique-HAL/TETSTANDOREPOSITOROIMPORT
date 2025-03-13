package ex4;

//Verificação de maioridade:

//Crie um programa que peça a idade do usuário.
//Use if para verificar se a idade é maior ou igual a 18.
//Se for maior ou igual a 18, exiba a mensagem "Maior de idade".




import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Idade Aqui : ");
        int Idade = scanner.nextInt();

        if(Idade<18){
            System.out.println("Voce nao e maior de Idade");
        } else {
            System.out.println("Voce ja e um Adulto");

        }

        scanner.close();



    }
}
