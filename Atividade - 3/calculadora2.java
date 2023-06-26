import java .util.Scanner;

public class calculadora2  {
    int numero1, numero2, resultado;

    public void Adicao(){
        resultado = numero1 + numero2;
        System.out.print(numero1 + " + "+ numero2 + " = " + resultado);
        }
        public void Subtracao() {
            resultado = numero1 - numero2;
            System.out.print(numero1 + " - "+ numero2 + " = " + resultado);
        }
        public void Mutiplicacao(){
            resultado = numero1 * numero2;
            System.out.print(numero1 + " * "+ numero2 + " = " + resultado);
            }
            public void divisao(){
                resultado = numero1 / numero2;
                System.out.print(numero1 + " / "+ numero2 + " = " + resultado);
                }

}