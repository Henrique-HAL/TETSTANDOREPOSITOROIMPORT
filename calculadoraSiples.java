public class calculadoraSiples {
    public static void main(String[] args) {
        double num1 = 3;
        double num2 = 90;
        int operador = 1;

        double resultado = 0;

        if(operador == 1) {
            resultado =num1 + num2;
        } else if(operador == 2) {
            resultado =num1 - num2;
        } else if(operador == 3) {
            resultado =num1 * num2;
        } else if(operador == 4) {
            if(num2 != 0) {
                resultado =num1 / num2;
            }else {
                System.out.println("Erro de divisao por 0 nao e permitido");
                return;
            }
        } else {
            System.out.println("Opercao Invalida");
            return;

        }


        System.out.println("Resultado da operacao=" + resultado);





    }
}
