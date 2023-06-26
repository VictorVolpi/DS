import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM=10;
        int a[], b[], c[];
        a = new int [TAM];
        b = new int [TAM];
        c = new int [TAM];

        for(int i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+" valor do vetor A");
            a[i] = in.nextInt();
        }
         for(int i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+" valor do vetor B");
            b[i] = in.nextInt();
        }
         
        for(int i=0; i<TAM; i++) {
            c[i] = a[i] + b[i];
        }
            System.out.print("\nC = ");
             for(int i=0; i<TAM; i++) {
                System.out.println(c[i]);

            }
        }
}