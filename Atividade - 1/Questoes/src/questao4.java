
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        String res = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("digite o primeiro pre�o");
            double productPrice = in.nextDouble();
            System.out.print("digite a margem de lucro");
            double profitMaargin = in.nextDouble();
            double sellPrice =(productPrice * profitMaargin/100);
            System.out.print("o pre�o final � "+sellPrice);
            System.out.println (" Deseja continuar a execu��o? (S/N)");
            res = in.next();
            
            
        }while(!res.equalsIgnoreCase("n"));
        in.close();
    }
}