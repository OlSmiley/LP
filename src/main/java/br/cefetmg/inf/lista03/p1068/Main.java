package br.cefetmg.inf.lista03.p1068;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class VerificadorParenteses<T> {
    private Queue<T> fila;

    public VerificadorParenteses() {
        fila = new LinkedList<>();
    }

    public boolean verificar(String expressao) {
        for (int i = 0; i < expressao.length(); i++) {
            char ch = expressao.charAt(i);

            if (ch == '(') {
                fila.add((T) Character.valueOf(ch));
            } else if (ch == ')') {
                if (fila.isEmpty()) {
                    return false;
                }
                fila.poll();
            }
        }
        return fila.isEmpty();
    }

    public void limpar() {
        fila.clear();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificadorParenteses<Character> verificador = new VerificadorParenteses<>();

        // Processa todas as linhas de entrada até o final
        while (scanner.hasNextLine()) {
            String expressao = scanner.nextLine();
            if (verificador.verificar(expressao)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
            verificador.limpar();
        }

        scanner.close();
    }
}