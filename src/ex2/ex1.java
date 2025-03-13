package ex2;
//Exercício 2: Classificação de Idade
//
//Crie um programa que peça a idade de uma pessoa e a classifique nas seguintes categorias:
//Criança (0-12 anos)
//Adolescente (13-17 anos)
//Adulto (18-59 anos)
//Idoso (60 anos ou mais)
//Imprima a categoria correspondente à idade informada.

import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui sua idade");
        int idade = scanner.nextInt();

        if(idade >= 0 && idade <= 12){
            System.out.println("Voce e uma Cria7nca");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Voce e um adolocente");
        } else if (idade >= 18 && idade <=59) {
            System.out.println("Voce e um Adulto");
        }else {
            System.out.println("Parabens voce e um idoso");
        }

        scanner.close();
    }
}
