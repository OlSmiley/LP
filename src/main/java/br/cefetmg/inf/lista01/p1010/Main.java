package br.cefetmg.inf.lista01.p1010;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int p1, n1, p2, n2;
	double val1, val2, total_value;
    
    p1 = scan.nextInt();
    n1 = scan.nextInt();
    val1= scan.nextDouble();
    p2 = scan.nextInt();
    n2 = scan.nextInt();
    val2 = scan.nextDouble();
    
    total_value = ((val1 * n1) + (val2 * n2));
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total_value);
	}
}
