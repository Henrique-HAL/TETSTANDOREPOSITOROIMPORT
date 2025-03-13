package exercicio1;
//1. Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão
//informados	valores	iguais)	e	escrever	o	maior	deles.

import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui o Primeiro Numero");
        int valor1 = scanner.nextInt();

        System.out.println("Digite aqui o Segundo Numero");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior valor e:" + valor1);
        } else if(valor1 < valor2) {
            System.out.println("O maoir numero e:" + valor2);
        } else {
            System.out.println("Nao vai ter numero igual aqui parceiro");
        }


        scanner.close();
    }
}






