package br.cefetmg.inf.lista02.p2060;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0, total = 0, val = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0;

        total = scanner.nextInt();

        for (i = 0; i < total; i++) {
            val = scanner.nextInt();

            if (val % 2 == 0) {
                m2++;
            }
            if (val % 3 == 0) {
                m3++;
            }
            if (val % 4 == 0) {
                m4++;
            }
            if (val % 5 == 0) {
                m5++;
            }
        }

        System.out.println(m2 + " Multiplo(s) de 2");
        System.out.println(m3 + " Multiplo(s) de 3");
        System.out.println(m4 + " Multiplo(s) de 4");
        System.out.println(m5 + " Multiplo(s) de 5");

        scanner.close();
    }
}
