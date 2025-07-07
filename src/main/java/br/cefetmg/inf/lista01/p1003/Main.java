package br.cefetmg.inf.lista01.p1003;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a, b, x;
        
        a = scan.nextInt();
        b = scan.nextInt();
        
        x = a + b;
        
        System.out.printf("SOMA = %d\n", x);
    }
}
