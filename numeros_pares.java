package vetoresExc;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner jl = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = jl.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = jl.nextInt();
        }
        System.out.println();
        int a = 0;
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] % 2) == 0) {
                System.out.print(numeros[i] + "  ");
                a++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + a);
        jl.close();
    }
}
