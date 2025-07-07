package br.cefetmg.inf.lista02.p1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0, aux = 0, i = 0, soma = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a % 2 != 0) {
            for (i = a + 2; i <= b - 1; i = i + 2) {
                soma = soma + i;
            }
        } else if (a % 2 == 0) {
            for (i = a + 1; i <= b - 1; i = i + 2) {
                soma = soma + i;
            }
        }

        System.out.println(soma);
    }
}
