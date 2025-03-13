package ex3;




public class tete {
    public static void main(String[] args){

        System.out.println("Digite aqui seu peso em kg");
        double peso = 101.1;

        System.out.println("Digite aqui sua altura em metros");
        double altura = 1.50;

        //Metodo usado
        double imc = calcularIMC(peso,altura) ;
        String classificao = classificarIMC(imc);
        //    aqui eu alterei de println para printf,pois na saida fica melhor apresentado com 2 casas decimais//
        System.out.printf("Seu imc e %.2f%n", imc);           // Ao adicionar o printf e %.2f%n deve colocar a variavel no caso imc a "," e tirar o +//
        System.out.println("Clasificao =" + classificao);

    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {

        if (imc < 18) {
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
