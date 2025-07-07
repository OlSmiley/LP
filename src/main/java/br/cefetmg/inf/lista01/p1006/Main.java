package br.cefetmg.inf.lista01.p1006;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	double a, b, c, mid;
    
    a = scan.nextDouble();
    b = scan.nextDouble();
    c = scan.nextDouble();
    
    a = 2 * a;
    b = 3 * b;
    c = 5 * c;
    
    mid = (a + b + c) /10;
    
    System.out.printf("MEDIA = %.1f\n", mid);
	}
}

