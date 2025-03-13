
//11: Desenvolva um programa que solicite ao usuário o valor total da compra e a
//porcentagem de desconto aplicada. Calcule e exiba: O valor do desconto aplicado. O valor finala pagar após o desconto.

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui o valor total da sua compra");
        double valorTotaldaCompra = scanner.nextDouble();

        System.out.println("Digite  a Porcentagem do Desconto que foi Aplicado");
        double valorDoDesconti = scanner.nextDouble();

        double valordodesconto = valorTotaldaCompra * (valorDoDesconti / 100);
        double valorfinalasepagar = valorTotaldaCompra - valordodesconto;

        System.out.println("O valor final a se pagar e : " + String.format("%.2f",valorfinalasepagar));
        System.out.println("O valor do Desconto e :" + String.format("%.2f", valordodesconto));

        scanner.close();

    }
}
