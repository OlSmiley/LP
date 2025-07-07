package br.cefetmg.inf.lista01.p1007;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int a, b, c, d, dif;
    
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    d = scan.nextInt();
    
    dif = ((a * b) - (c * d));
    
    System.out.printf("DIFERENCA = %d\n", dif);
	}
}