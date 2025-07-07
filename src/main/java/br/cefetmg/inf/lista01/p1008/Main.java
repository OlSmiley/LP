package br.cefetmg.inf.lista01.p1008;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int num, ht;
	double hv, salario;
    
    num = scan.nextInt();
    ht = scan.nextInt();
    hv = scan.nextDouble();
    
    salario = hv * ht;
    
    System.out.printf("NUMBER = %d\n", num);
    System.out.printf("SALARY = U$ %.2f\n", salario);
    
	}
}
