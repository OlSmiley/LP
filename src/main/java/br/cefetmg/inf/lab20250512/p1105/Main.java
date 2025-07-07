package br.cefetmg.inf.lab20250512.p1105;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B, N;
        do {
            B = scanner.nextInt();
            N = scanner.nextInt();
            if (B == 0 && N == 0) {
                break;
            }
            int[] valores = new int[B];
            for (int i = 0; i < B; i++) {
                valores[i] = scanner.nextInt();
            }
            for (int j = 0; j < N; j++) {
                int deve = scanner.nextInt();
                int cobra = scanner.nextInt();
                int valor = scanner.nextInt();
                valores[deve - 1] -= valor;
                valores[cobra - 1] += valor;
            }
           boolean pode = true;
            for (int k = 0; k < B; k++) {
                if (valores[k] < 0) {
                    pode = false;
                }
            }
            if (pode == false) {
                System.out.printf("N%n");
            } else if (pode == true) {
                System.out.printf("S%n");
            }
        } while (B != 0 && N != 0);
    }
}