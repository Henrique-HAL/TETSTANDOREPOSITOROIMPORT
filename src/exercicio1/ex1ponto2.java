package exercicio1;


//1. Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão
//informados	valores	iguais)	e	escrever	o	maior	deles.



public class ex1ponto2{
    public static void main(String[] args) {
        int valor1 = 399;
        int valor2 = 399;

        if (valor1 > valor2) {
            System.out.println("O maior valor e:" + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maoir numero e:" + valor2);

        }else {
            System.out.println("A operacao nao vai funcionar truta");
        }

    }
}
