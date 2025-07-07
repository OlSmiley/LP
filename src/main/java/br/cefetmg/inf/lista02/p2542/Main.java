package br.cefetmg.inf.lista02.p2542;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int L = sc.nextInt();

            int[][] marcos = new int[M][N];
            int[][] leonardo = new int[L][N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    marcos[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < L; i++) {
                for (int j = 0; j < N; j++) {
                    leonardo[i][j] = sc.nextInt();
                }
            }

            int CM = sc.nextInt(); // carta escolhida de Marcos
            int CL = sc.nextInt(); // carta escolhida de Leonardo
            int A = sc.nextInt();  // atributo sorteado

            int valM = marcos[CM - 1][A - 1];
            int valL = leonardo[CL - 1][A - 1];

            if (valM > valL) {
                System.out.println("Marcos");
            } else if (valL > valM) {
                System.out.println("Leonardo");
            } else {
                System.out.println("Empate");
            }
        }

        sc.close();
    }
}
