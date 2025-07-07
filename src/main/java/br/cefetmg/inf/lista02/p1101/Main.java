package br.cefetmg.inf.lista02.p1101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0, aux = 0, sum = 0, i = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        while (a > 0 && b > 0) {
            sum = 0;

            if (a > b) {
                aux = a;
                a = b;
                b = aux;
            }

            for (i = a; i <= b && i > 0; i++) {
                sum += i;
                System.out.print(i + " ");
            }

            if (i > 0)
                System.out.println("Sum=" + sum);

            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        scanner.close();
    }
}