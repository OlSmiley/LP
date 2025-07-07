package br.cefetmg.inf.lista02.p1129;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                int[] valores = new int[5];
                for (int j = 0; j < 5; j++) {
                    valores[j] = sc.nextInt();
                }

                int marcados = 0;
                int indice = -1;

                for (int j = 0; j < 5; j++) {
                    if (valores[j] <= 127) {
                        marcados++;
                        indice = j;
                    }
                }

                if (marcados == 1) {
                    System.out.println((char) ('A' + indice));
                } else {
                    System.out.println("*");
                }
            }
        }

        sc.close();
    }
}
