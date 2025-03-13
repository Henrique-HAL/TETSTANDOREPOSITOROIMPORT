package exercicio1;
//1. Escreva	 um	 programa	 para	 ler	 3	 valores	 (considere	 que	 	 não	 serão
//informados	valores	iguais)	e	escrever	o	maior	deles.

import java.util.Scanner;

public class ex1solo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro numero aqui---->");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o Segundo numero aqui---->");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o Terceiro numero aqui---->");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("O maoir numero e" + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("O maior numero e" + numero2);
        } else {
            System.out.println("O maior numero e :" + numero3);

            scanner.close();


        }

    }
}