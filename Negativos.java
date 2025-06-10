package vetoresExc;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Scanner jl = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = jl.nextInt();

        int[] numeros = new int[n];

        for(int i = 0; i < numeros.length; i++) {
            jl.nextLine();
            System.out.print("Digite um numero: ");
            numeros[i] = jl.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for(int a = 0; a < numeros.length; a++) {
            if(numeros[a] < 0){
                System.out.println(numeros[a]);
            }

        }
        jl.close();
    }
}
