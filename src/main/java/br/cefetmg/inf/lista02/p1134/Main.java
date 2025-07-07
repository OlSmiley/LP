package br.cefetmg.inf.lista02.p1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int alcool = 0, gasolina = 0, diesel = 0;

        do {
            num = scanner.nextInt();

            if (num == 1) {
                alcool++;
            } else if (num == 2) {
                gasolina++;
            } else if (num == 3) {
                diesel++;
            }

        } while (num != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        scanner.close();
    }
}