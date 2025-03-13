package ex3;
//Exercício 3: Cálculo de IMC

//Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. O programa deve solicitar o peso (em kg) e a altura (em metros) do usuário. Em seguida, classifique o IMC nas seguintes categorias:
//Abaixo do peso (IMC < 18.5)
//Sobrepeso (25 <= IMC < 30)
//Obesidade (IMC >= 30)
//Imprima o IMC e a categoria correspondente.


import java.util.Scanner;

public class imc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Logica de programacao//

        System.out.println("Digite aqui seu peso em kg");
        double peso = scanner.nextDouble();

        System.out.println("Digite aqui sua altura em metros");
        double altura = scanner.nextDouble();

        //Aqui eu estou chamndo o metodo calcularIMC(peso,altura) para a variavel de Double (imc)//
        double imc = calcularIMC(peso,altura) ;


        //Aqui eu estou chamando o  metodo classificarIMC(imc) para classificar o IMC dentro da variavel (imc)//
        String classificao = classificarIMC(imc);

        //aqui eu alterei de println para printf,pois na saida fica melhor apresentado com 2 casas decimais//
        System.out.printf("Seu imc e %.2f%n", imc);           // Ao adicionar o printf e %.2f%n deve colocar a variavel no caso imc a "," e tirar o +//
        System.out.println("Clasificao =" + classificao);


        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {

        if (imc < 18.5) {
            return "Abaixo de pesinho";
        } else if (imc < 25) {
            return "Peso normal amigao";
        } else if (imc < 30) {
            return "Da uma olhada nesse pesso ai amigao";
        } else if (imc < 35) {
            return "Coracao: Se voce nao parar eu paro ";
        } else if (imc < 40) {
            return "Se leko num compensa";
        } else if (imc < 45) {
            return "Tchau fui";
        }else {
            return "Ai ferrou parca";
        }
    }
}
