package br.cefetmg.inf.lista02.p1245;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] esquerdo = new int[61];
            int[] direito = new int[61];

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                String lado = sc.next();

                if (lado.equals("D")) {
                    direito[num]++;
                } else if (lado.equals("E")) {
                    esquerdo[num]++;
                }
            }

            int pares = 0;
            for (int i = 30; i <= 60; i++) {
                int menor = esquerdo[i];
                if (direito[i] < menor) {
                    menor = direito[i];
                }
                pares += menor;
            }

            System.out.println(pares);
        }

        sc.close();
    }
}
