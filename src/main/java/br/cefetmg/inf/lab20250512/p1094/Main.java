package br.cefetmg.inf.lab20250512.p1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int linhas = entrada.nextInt();
        int coelhos = 0, ratos = 0, sapos = 0;
        int totalCobaias = 0;

        while (linhas-- > 0) {
            int quantidade = entrada.nextInt();
            char especie = entrada.next().charAt(0);

            totalCobaias += quantidade;

            switch (especie) {
                case 'C' -> coelhos += quantidade;
                case 'R' -> ratos += quantidade;
                case 'S' -> sapos += quantidade;
            }
        }

        entrada.close();

        double percCoelho = (coelhos * 100.0) / totalCobaias;
        double percRato = (ratos * 100.0) / totalCobaias;
        double percSapo = (sapos * 100.0) / totalCobaias;

        System.out.printf("Total: %d cobaias%n", totalCobaias);
        System.out.printf("Total de coelhos: %d%n", coelhos);
        System.out.printf("Total de ratos: %d%n", ratos);
        System.out.printf("Total de sapos: %d%n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", percRato);
        System.out.printf("Percentual de sapos: %.2f %%%n", percSapo);
    }
}