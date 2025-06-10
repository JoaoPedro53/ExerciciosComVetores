package vetoresExc;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner jl = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = jl.nextInt();

        double[] numeros = new double[n];

        for(int i = 0; i< numeros.length; i++) {
            System.out.printf("Digite um número: ");
            numeros[i] = jl.nextDouble();
        }

        System.out.print("VALORES =");

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("  %.1f" , numeros[i]);
        }

        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MÉDIA = %.2f", soma / numeros.length);
        jl.close();
    }
}
