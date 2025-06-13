package vetoresExc;

import java.util.Locale;
import java.util.Scanner;

public class maior_posição {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner jl = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = jl.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = jl.nextDouble();
        }

        System.out.println();
        double maior = numeros[0];
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
                indice = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + indice);

        jl.close();
    }
}
