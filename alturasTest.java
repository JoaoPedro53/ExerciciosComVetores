package vetoresExc;

import java.util.Locale;
import java.util.Scanner;

public class alturasTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner jl = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = jl.nextInt();

        Pessoas[] pessoas = new Pessoas[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("dados da "+ (i + 1) + "a pessoa: ");
            jl.nextLine();
            System.out.print("Nome: ");
            String nome = jl.nextLine();
            System.out.print("Idade: ");
            int idade = jl.nextInt();
            System.out.print("Altura: ");
            double altura = jl.nextDouble();
            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        System.out.println();
        double alturas = 0;
        for (int i = 0; i < pessoas.length; i++) {
            alturas += pessoas[i].getAltura();
        }
        System.out.printf("Altura média: %.2f" , alturas / pessoas.length);
        System.out.println();

        double a = 0;
        double p = 0;
        for (int i = 0; i < pessoas.length; i++) {
            double idadeM = pessoas[i].getIdade();
            if (idadeM < 16) a++;
            p++;
        }
        System.out.println("Pessoas com menos de 16 anos: " + (a / p) * 100 + "%");
        for (int i = 0; i < pessoas.length; i++) {
            double idadeM = pessoas[i].getIdade();
            if (idadeM < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}