import java .util.Scanner;
public class Calculadora {
    public static void main (String[]args) {

        Scanner in = new Scanner (System.in);
        Calculadora calculo1 = new Calculadora();

        System.out.print("Informe o 1º Numero");
        calculo1.numero1 = in.nextInt();

        System.out.print("Informe o 2º Numero");
        calculo1.numero2 = in.nextInt();

        calculo1.Adicao();
        calculo1.Subtracao();
        calculo1.Mutiplicacao();
        calculo1.divisao();
        System.out.println("calculo1.resultado");

        in.close();
    }
 }