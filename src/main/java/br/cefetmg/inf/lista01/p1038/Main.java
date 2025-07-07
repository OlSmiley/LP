package br.cefetmg.inf.lista01.p1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double q, p;
		int cod;
		
		cod = sc.nextInt();
		q = sc.nextDouble();
	
		if(cod == 1) {
			
			p = q * 4;
			System.out.printf("Total: R$ %.2f%n", p);
		} 
		else if (cod == 2) {
			
			p = q * 4.5;
			System.out.printf("Total: R$ %.2f%n", p);
		} 
		else if (cod == 3) {
			
			p = q * 5;
			System.out.printf("Total: R$ %.2f%n", p);
		} 
		else if (cod == 4) {
			
			p = q * 2;
			System.out.printf("Total: R$ %.2f%n", p);
		} 
		else if(cod == 5){
			
			p = q * 1.5;
			System.out.printf("Total: R$ %.2f%n", p);
		}
		
		
		sc.close();

	}

}
