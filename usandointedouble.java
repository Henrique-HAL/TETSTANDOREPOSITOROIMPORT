import java.util.Scanner;

public class usandointedouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de jogos vendidos: ");
        String input= scanner.nextLine();
        int quantidadejogosvendidos = Integer.parseInt(input);


        System.out.println("Digite o Valor do jogo que foi vendido: " );
        String duque= scanner.nextLine();
        double valordosjogos = Double.parseDouble(duque);

        // Aqui e a conta feita (quantida de jogos vendidos * o valor dos jogos)//
        double totaldavenda = quantidadejogosvendidos * valordosjogos;



        System.out.println("Valor total da vendas dos jogos = " + String.format("%.2f",totaldavenda));

        scanner.close();





    }
}



