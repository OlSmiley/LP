package br.cefetmg.inf.lista02.p2163;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] terreno = new int[N][M];

        // Lendo o terreno
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                terreno[i][j] = sc.nextInt();
            }
        }

        // Procurando pelo padrão
        int x = 0;
        int y = 0;

        // Percorrer só até N-2 e M-2 porque o padrão é 3x3
        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < M - 1; j++) {

                if (terreno[i][j] == 42) {
                    // Verificar os 8 vizinhos
                    if (terreno[i-1][j-1] == 7 &&
                        terreno[i-1][j] == 7 &&
                        terreno[i-1][j+1] == 7 &&
                        terreno[i][j-1] == 7 &&
                        terreno[i][j+1] == 7 &&
                        terreno[i+1][j-1] == 7 &&
                        terreno[i+1][j] == 7 &&
                        terreno[i+1][j+1] == 7) {
                        
                        x = i + 1;
                        y = j + 1;
                        break;
                    }
                }
            }
            if (x != 0) break;
        }

        System.out.println(x + " " + y);

        sc.close();
    }
}
